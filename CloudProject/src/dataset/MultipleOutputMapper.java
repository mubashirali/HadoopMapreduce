package dataset;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import cloudComputing.Main;

public class MultipleOutputMapper extends
		Mapper<LongWritable, Text, Text, Text> {

	// private Text txtKey = new Text("");
	// private Text txtValue = new Text("");
	private static double count = 1;

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {

		FileSystem fs = FileSystem.get(new Configuration());

		if (value.toString().length() > 0) {
			FSDataOutputStream out = fs.create(new Path(Main.outputDir
					+ "/Dataset/" + count++));
			String line = value.toString().toLowerCase()
					.substring(value.toString().lastIndexOf("|") + 1);
			line = line.replaceAll("[-+.^:,;\"()'?!]", "");
			out.writeBytes(line);
			out.close();
			// context.write(value, new Text(""));
		}

	}
}