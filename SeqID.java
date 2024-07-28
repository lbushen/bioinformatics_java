import java.util*;
import java.io*;

public class SeqID{

	private String seq;
	private String id;
	public ArrayList<String> sequence = new ArrayList<String>();

	public SeqID(String seq, String id){
		seq = seq;
		id = id;
	}
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}

	public String getSeq(){
		return seq;
	}
	public void setSeq(String seq){
		this.seq = seq;
	}
	public boolean enterSequence(String id){
		//loop to prompt user

		//reads file and stores it in an array
		

		

		//a do while loop to keep prompting the user to enter
		// a valid sequence ID
		// until user types "quit"
		do ()

	}
}

/*
seqID = starts with ">" endswith "|"
searches between starts with and ends with  for the exact string 
the user inputted
if user input does not match seqID, keep in loop
if user does not enter a valid id
	print: {id} entered is not in the file
*/


	public static void main(String[] args){

		// create a input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the sequence file: ");
		String myfile = input.nextLine();




	}