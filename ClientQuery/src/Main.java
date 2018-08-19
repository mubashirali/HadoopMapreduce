import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static ArrayList<String> fileCount = new ArrayList<String>();
	private static ArrayList<String> commonfile = new ArrayList<String>();

	public static void main(String[] args) throws IOException {

		ArrayList<String> tempQuery = new ArrayList<String>();
		ArrayList<String> listQuery = new ArrayList<String>();

		if (args.length != 1) {
			System.err.println("usage: [input] [output]");
			System.exit(-1);
		}

		Scanner scan = new Scanner(System.in);
		String query; // = scan.nextLine();

		query = "profit wealth";// query.toLowerCase();

		for (String string : query.split(" "))
			tempQuery.add(string);

		try (BufferedReader read = new BufferedReader(new FileReader(args[0]
				+ "/Dictionary/part-r-00000"))) {

			String line = null;

			while ((line = read.readLine()) != null) {
				if (tempQuery.contains(line))
					listQuery.add(line);
			}
		} catch (IOException e) {
			System.err.print(e.getMessage());
		}

		try (BufferedReader read = new BufferedReader(new FileReader(args[0]
				+ "/PostingList/part-00000"))) {

			String line = null;// = read.readLine();

			while ((line = read.readLine()) != null) {

				line = line.replaceAll("['\t']", " ");
				String[] strLine = line.replaceAll("[,]", "").split(" ");

				if (listQuery.contains(strLine[0])) {
					// System.out.println(line);
					for (int index = 1; index < strLine.length; index++) {
						strLine[index] = strLine[index].trim();
						if (!strLine[index].equals(null))
							fileCount.add(strLine[index]);

					}
				}
			}

		} catch (IOException e) {
			System.err.print(e.getMessage());
		}

		getCommonFiles();
		/*
		 * for (String string : commonfile) { System.out.println(string); }
		 */

		if (commonfile.size() == 0) {
			commonfile = new ArrayList<String>(fileCount);
			System.err.println("String does not exist in same sentence ");
		}

		for (String string : commonfile) {

			try (BufferedReader read = new BufferedReader(new FileReader(
					args[0] + "/Dataset/" + string + ".0"))) {

				String line;// = read.readLine();

				while ((line = read.readLine()) != null) {
					System.out.println(line);

				}
			} catch (IOException e) {
				System.err.print(e.getMessage());
			}
		}
	}

	private static void getCommonFiles() {
		Set<String> frequency = new HashSet<String>(fileCount);

		for (String string : frequency) {
			if (Collections.frequency(fileCount, string) > 1)
				commonfile.add(string);
		}
	}
}