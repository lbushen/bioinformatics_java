import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class seqRegex {

	public static void main(String[] args) throws IOException

	{

		ArrayList<String> listofStrings = new ArrayList<String>();
		ArrayList<String> matchesList = new ArrayList<String>();

		BufferedReader bf = new BufferedReader(new FileReader("seq.fasta"));

		String line = bf.readLine();

		while (line != null) {
			listofStrings.add(line);
			line = bf.readLine();

		}
		bf.close();
		// convert arraylist to string

		String string = "";
		// replace line breads:
		for (String list : listofStrings) {
			string += list;
		}

		String s = string.replace("\n", "");

		System.out.println(s);

		Pattern p1 = Pattern.compile("[a-z]{2}[0-9]{2}[a-z][0-9]{2}.[a-z][0-9]|[ATGC]+");
		Matcher m1 = p1.matcher(s);

		while (m1.find()) {
			matchesList.add(m1.group());
		}

		System.out.println(matchesList);

	}

}

/*
 * 
 * idea to concat lines together: if line ends with [ATGC] and next line begins
 * with [ATGC] then concat
 * 
 * String text = readFileAsString("seq.fasta"); text = text.replace("\n",
 * "").replace("\r", "");
 * 
 * int sizeOfNewArray = matchesList.size(); String newArrayOfMatches[] = new
 * String[sizeOfNewArray]; matchesList.toArray(newArrayOfMatches);
 * 
 * System.out.println(newArrayOfMatches);
 */

// if line starts with ">" parse [a-z]{2}[0-9]{2}[a-z][0-9]{2}.[a-z][0-9] add to arrayList [0]
// if line doesn't start with ">" concatenate lines and add to arrayList [1]