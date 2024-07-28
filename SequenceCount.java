import java.io.*;
import java.util.*;

// loop through lines of file...if line startswith ">"....count++
//user BufferedReader to read 1 line at a time

public class SequenceCount {

	public static void main(String[] args) {

		int count = 0;// initialize count variable

		// get filename from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the sequence file:  ");
		String myfile = input.nextLine();

		// exception handling reading file line by line

		try (Scanner sc = new Scanner(new File(myfile))) {// from
															// https://stackoverflow.com/questions/49756410/read-a-fasta-file-into-string-java
			while (sc.hasNextLine()) {// loops through every line in file until it reaches the end
				String line = sc.nextLine();// saves each line in a file as "line" variable
				// count the lines that start with ">"
				if (line.startsWith(">")) {
					count++;
				}
			}
			System.out.println("\nFile " + myfile + " contains " + count + " sequences\n");
		}

		catch (IOException e) {
			System.out.println("\nFile not found");
		}

		System.out.println("\n=================");
		System.out.println("Author: Lee Bushen");
	}
}