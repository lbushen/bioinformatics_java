import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class Stream extends DNA {
	/*
	 * public Stream(String seq, String id){ super(seq,id); }
	 */

	public static void readfile() {

	}

	public static void check(ArrayList<String> arr, String str) {

		int index = 0;
		int ind2 = 0;

		for (String s : arr) {
			if (arr.contains(str)) {
				index = arr.indexOf(str);
				ind2 = index + 1;
				break;
			} else {
				continue;
			}
		}

		System.out.println(">" + str);
		System.out.println(arr.get(ind2));
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the sequence file: ");
		String name = input.nextLine();

		Stream nucleotide = new Stream();

		nucleotide.check(fasta, name);

	}

}