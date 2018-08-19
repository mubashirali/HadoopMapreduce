package cloudComputing;

import postingList.*;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;

public class PostingList {
	public static void createPostingList(String[] args)
			throws ClassNotFoundException, InterruptedException {
		JobClient client = new JobClient();
		JobConf conf = new JobConf(PostingList.class);

		conf.setJobName("LineIndexer");

		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(Text.class);

		FileInputFormat.addInputPath(conf, new Path(args[0]));
		FileOutputFormat
				.setOutputPath(conf, new Path(args[1] + "/PostingList"));

		conf.setMapperClass(LineIndexMapper.class);
		conf.setReducerClass(LineIndexReducer.class);

		client.setConf(conf);

		try {
			JobClient.runJob(conf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
