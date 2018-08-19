package dataset;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class MultiOutputReducer extends Reducer<Text, Text, Text, Text> {

	private MultipleOutputs<Text, Text> multipleOutputs;
	private static long fileName = 0;

	@Override
	protected void setup(Context context) throws IOException,
			InterruptedException {
		multipleOutputs = new MultipleOutputs<Text, Text>(context);
	}

	@Override
	protected void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException, InterruptedException {
		// System.err.println(key.getLength());
		for (Text value : values) {
			multipleOutputs.write(key, value, "" + fileName);
			fileName++;
			 //System.err.println(value + " " + fileName);
		}
	}

	@Override
	protected void cleanup(Context context) throws IOException,
			InterruptedException {
		// System.out.println("here---------------------------------------");
		multipleOutputs.close();
	}

}