
/*
to write a method that will validate if a DNA sequence only
contains AGTC using regular expressions
*/

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class isvalidDNA {

	// declare static variables so all instances of this class use the same variable
	public static String Dna;

	// constructor method
	DNAValid (String n){
		Dna = n;
	}

	// method to validate if input contains only A,C,G,T using re

	public void isDNAvalid() {

		Pattern target = Pattern.compile("[^AGTC]"); // expression for NOT A, G, T, or C

		Matcher match = target.matcher(Dna);
		boolean matchFound = match.find();

		if (matchFound) { // if matchFound is true
			System.out.println("\nSequence invalid");

		} else {
			System.out.println("\nSequence valid");
		}

	}

	public static void main(String[] args) {
		// get user input and change to upper case
		String sequence;
		String seqUnform;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a DNA sequence: ");
		seqUnform = input.nextLine();
		sequence = seqUnform.toUpperCase();

		// create object with user input
		DNAValid seq1 = new DNAValid(sequence);

		// run method on object
		seq1.isDNAvalid();

		System.out.println("\n=================");
		System.out.println("Author: Lee Bushen");
	}

}