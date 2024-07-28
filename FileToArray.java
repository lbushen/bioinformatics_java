
// import necessary packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileToArray {
	// to handle exceptions include throws
	// https://www.geeksforgeeks.org/read-file-into-an-array-in-java/

// regex to search id:
// Pattern p1 = Pattern.compile("\w{2}\d{2}\w\d{2}.\w\d"); 
// Matcher m1 = p1.matcher(file)

// regex for 1 line of nucleotides
// Pattern p2 = Pattern.compile("[ATGC]+")
// Matcher m2 = p2.matcher(file)
//   

	public static void main(String[] args) throws IOException {
		// list that holds strings of a file
		List<String> listOfStrings = new ArrayList<String>();

		// load data from file
		BufferedReader bf = new BufferedReader(new FileReader("seq.fasta"));

		// read entire line as string
		String line = bf.readLine();

		// checking for end of file
		while (line != null) {
			listOfStrings.add(line);
			line = bf.readLine();
		}

		// closing bufferreader object
		bf.close();

		// storing the data in arraylist to array
		String[] array = listOfStrings.toArray(new String[0]);

		// printing each line of file
		// which is stored in array
		for (String str : array) {
			// loop through with regex here?
			System.out.println(str);
		}
	}
}
