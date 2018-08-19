package postingList;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class LineIndexMapper extends MapReduceBase implements
		Mapper<LongWritable, Text, Text, Text> {

	private final static Text word = new Text();
	private final static Text location = new Text();
	private static int lineNum = 0;

	public void map(LongWritable key, Text value,
			OutputCollector<Text, Text> output, Reporter reporter)
			throws IOException {

		/*
		 * FileSplit fileSplit = (FileSplit) reporter.getInputSplit(); String
		 * fileName = fileSplit.getPath().getName();
		 */

		lineNum++;
		location.set(lineNum + "");

		String line = value.toString().toLowerCase()
				.substring(value.toString().lastIndexOf("|") + 1);
		line = line.replaceAll("[-+.^:,;\"()'?!]", "");

		StringTokenizer itr = new StringTokenizer(line.toLowerCase());
		while (itr.hasMoreTokens()) {
			word.set(itr.nextToken());
			output.collect(word, location);
		}
	}
}