import java.io.File;
import java.util.*;

public class ScannerTest{

	public static void main(String[] args){

		String id = "";
		String sequence;
		String seqUnform;
		//String input = "";

		while (input != "exit"){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a Clone ID: ");
		id = input.nextLine();
	
		System.out.println("Please enter a DNA sequence: ");
		seqUnform = input.nextLine();
		sequence = seqUnform.toUpperCase();

		System.out.println(id + " " + sequence);
		}
	}
}