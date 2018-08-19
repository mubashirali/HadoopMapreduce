package cloudComputing;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.NullOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.io.Text;

import dataset.*;
import dictionary.*;

public class Main {

	public static String inputDir;
	public static String outputDir;

	public static void main(String[] args) throws Exception {

		if (args.length != 2) {
			System.err.println("usage: [input] [output]");
			System.exit(-1);
		}

		inputDir = args[0];
		outputDir = args[1];
		
		createDictionary(args);
		createDataset(args);
		PostingList.createPostingList(args);

	}

	private static void createDataset(String[] args) {
		try {
			Configuration conf = new Configuration();

			@SuppressWarnings("deprecation")
			Job job = new Job(conf);
			job.setJobName("MultipleOutputFormat example");
			job.setJarByClass(Main.class);

			// LazyOutputFormat.setOutputFormatClass(job,
			// TextOutputFormat.class);
			job.setOutputFormatClass(NullOutputFormat.class);
			job.setInputFormatClass(TextInputFormat.class);
			// job.setOutputFormatClass(TextOutputFormat.class);

			FileInputFormat.setInputPaths(job, new Path(args[0]));
			// FileOutputFormat.setOutputPath(job, new Path(args[1] +
			// "/Dataset"));

			job.setMapperClass(MultipleOutputMapper.class);
			// job.setReducerClass(MultiOutputReducer.class);

			job.setMapOutputKeyClass(Text.class);
			job.setMapOutputValueClass(Text.class);

			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(Text.class);

			job.setNumReduceTasks(0);
			job.waitForCompletion(true);

		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	private static void createDictionary(String[] args) throws Exception {
		Configuration conf = new Configuration();
		@SuppressWarnings("deprecation")
		Job job = new Job(conf, "Dictionary");

		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);

		job.setMapperClass(WordMapper.class);
		job.setReducerClass(SumReducer.class);

		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);

		FileInputFormat.setInputPaths(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1] + "/Dictionary"));

		job.setJarByClass(Main.class);
		job.submit();
	}

}