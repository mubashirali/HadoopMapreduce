package dictionary;

import stopWords.*;
import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	private final static IntWritable one = new IntWritable(1);
	private Text word = new Text();
	private static StopWords sW = new StopWords();

	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		String line = null;

		if (value.toString().length() > 0) {
			line = value.toString().toLowerCase().substring(value.toString().lastIndexOf("|") + 1);
			line = line.replaceAll("[-+.^:,;\"()'?!]", "");

			StringTokenizer tokenizer = new StringTokenizer(line);
			while (tokenizer.hasMoreTokens()) {		
				//System.out.println(tokenizer.toString());
				if (!sW.ContainsSW(word.toString()))
					context.write(word, one);
				word.set(tokenizer.nextToken());
			}
		}
	}
}