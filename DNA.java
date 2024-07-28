/*
Class Name: BIFS618
Homework assignment02, questions #1 and #2
File name: DNA.class
Program author name: Lee Bushen
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
    
public class DNA{

	//declare static variables so all instances of this class use the same variable
	private String Dna;
	private char b;
	private static String seq;
	private static String id;

	public static ArrayList<String> fasta = new ArrayList<String>();

	//constructor method
	/*
	DNA (String n){
		Dna = n;
	}
	
	public DNA(String seq, String id){
		seq = seq;
		id = id;
	}
	*/
	public static String getId(){
		return id;
	}
	
	public static void setId(String id){
		id = id;
	}

	public static String getSeq(){
		return seq;
	}
	public static void setSeq(String seq){
		seq = seq;
	}
	//method to validate if input contains only A,C,G,T
	// returns 1 if there is a letter other than A,C,G,T
	/*
	public int isDNAvalid(){
		char c;
		int count = 0;//initialize count

		for(int i=0; i<Dna.length(); i++){
			c = Dna.charAt(i);//finds character at each interation and evaluates
			if (c =='A'||c == 'C'||c == 'G'||c =='T'){
				continue;
			} else {
				count++;
				break;				
			}
		}	

		if (count != 0){//returns value of 0 or 1 from result of for loop
			return 1;
		}else{
			return 0;
		}	
	}

	public int getSize() {//method to get length of user input
		int size = 0;
		size = Dna.length();
		return size;
	}

	public double baseCount(char b){//method to count each base (b) of user input
		char c;
		double count = 0;
		for (int i = 0; i<Dna.length(); i++){
			c = Dna.charAt(i);
			if (c == b){
				count++;
			} else {
				continue;
			}	
		}
		
		return Math.round(count);//returns a rounded value
	}
	
	public static void main(String[]args){
		//get user input and change to upper case
		String sequence;
		String seqUnform;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a DNA sequence: ");
		seqUnform = input.nextLine();
		sequence = seqUnform.toUpperCase();
		
		//create object with user input
		//DNA seq1 = new DNA(sequence);

		//check if the sequence is valid
		seq1.isDNAvalid();

		if (seq1.isDNAvalid()==1){
			System.out.println("Invalid sequence");//if not valid, program ends
		}else{ 
			//if valid, runs the other methods and rounds values to whole number
			System.out.println("Sequence is "+seq1.getSize()+" nucleotides long.");
			System.out.println("Count of A: "+Math.round(seq1.baseCount('A')));
			System.out.println("Count of G: "+Math.round(seq1.baseCount('G')));
			System.out.println("Count of C: "+Math.round(seq1.baseCount('C')));
			System.out.println("Count of T: "+Math.round(seq1.baseCount('T')));
			
			//get GC content
			double gcContent = 0;
			gcContent = ((seq1.baseCount('C') + seq1.baseCount('G'))/seq1.getSize())*100;
			System.out.printf("GC content is: %.0f",gcContent);
			System.out.println("%");
		}

	}
	*/
}