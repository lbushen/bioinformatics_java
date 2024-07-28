import java.io.File;
import java.util.*;
//import java.lang.*;

public class CloneDnaFasta{

	private Formatter seqFile;
	public String id = "";
	public String sequence;
	public String seqUnform;
	private Scanner x;
	
	public void openFile(){

		try{
			seqFile = new Formatter("finalSequences.fasta");	
		}
		catch (Exception e){
			System.out.println("You got an error");
		}
	}

	public void addSequences(){

		Scanner input = new Scanner(System.in);
		int count = 0;
		while (count == 0){
			
			System.out.println("Please enter a Clone ID: ");
			id = input.nextLine();
			if (id.equals("exit")) {
				count = 1;
			} else {
				System.out.println("Please enter a DNA sequence: ");
				seqUnform = input.nextLine();
				sequence = seqUnform.toUpperCase();

				seqFile.format(">%s\n%s\n", id, sequence);
			}
		 
		}
	}

	public void closeFile(){

		seqFile.close();
	}
	
	public void printFile() {
		
			try {
				x = new Scanner(new File("finalSequences.fasta"));
			}
		
			catch(Exception e) {
				System.out.println("file does not exist");
			}
			while(x.hasNext()){
				String a = x.next();
				String b = x.next();
				System.out.printf("%s\n%s\n", a, b);
			}
		}
	
	public static void main(String[] args){

		CloneDnaFasta s = new CloneDnaFasta();
		s.openFile();
		s.addSequences();
		s.closeFile();
		s.printFile();
	}
}