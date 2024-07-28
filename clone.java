import java.io.File;
import java.util.*;

public class clone{


	public static void main(String[] args){

		String id;
		String sequence;
		String seqUnform;

		final Formatter seqFile;

		try{
			seqFile = new Formatter("final_sequences.fasta");
			
		}
		catch (Exception e){
			System.out.println("You got an error");
		}

		while (id!="quit"){
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a Clone ID: ");
			id = input.nextLine();

			System.out.println("Please enter a DNA sequence: ");
			seqUnform = input.nextLine();
			sequence = seqUnform.toUpperCase();
		}
		if (id == "quit"){
			while(seqFile.hasNext()){
				String a = seqFile.next();
				String b = seqFile.next();

				System.out.printf("%s\n%s\n", a, b);

			}
		seqFile.format(">%s\n%s\n", id, sequence);
		
		}
	}
}

