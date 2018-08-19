package postingList;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class LineIndexReducer extends MapReduceBase implements
		Reducer<Text, Text, Text, Text> {

	public void reduce(Text key, Iterator<Text> values,
			OutputCollector<Text, Text> output, Reporter reporter)
			throws IOException {
		Set<Text> outputValues = new HashSet<Text>();

		while (values.hasNext()) {
			// make a new Object because Hadoop may mess with original
			Text value = new Text(values.next());
			
			// takes care of removing duplicates
			outputValues.add(value);
		}

		boolean first = true;
		StringBuilder toReturn = new StringBuilder();
		Iterator<Text> outputIter = outputValues.iterator();
		while (outputIter.hasNext()) {
			if (!first)
				toReturn.append(", ");
			first = false;
			toReturn.append(outputIter.next().toString());
		}

		output.collect(key, new Text(toReturn.toString()));
	}
}
