import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Findidx{

	
	private String seq;
	private String id;

	 
	public Findidx(String seq, String id){
		seq = seq;
		id = id;
	}

	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		id = id;
	}

	public String getSeq(){
		return seq;
	}
	public void setSeq(String seq){
		seq = seq;
	}
	
	//public static void check(ArrayList<String> arr, String name){

		
	public static void main(String[] args){

		
		ArrayList<String> fasta = new ArrayList<String>();
		fasta.add("Lee");
		fasta.add("TTTTTTTTT");
		fasta.add("Laura");
		fasta.add("AAAAAAAAA");
		fasta.add("Andrew");
		fasta.add("GGGGGGGG");
		System.out.println(fasta);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the sequence file: ");
		String name = input.nextLine();

		int index=0;
		int ind2=0;

		for (String s : fasta) {
                if (fasta.contains(name)) {
                    index = fasta.indexOf(name);
					ind2 = index + 1;
					
            	}
            	
            }
            System.out.println(">" + name);
			System.out.println(fasta.get(ind2));
		
		//ArrayList<String> array = new ArrayList<String>();
        
         
      

	}
}

int count = 1;
while(true) {
   sum += data;

   System.out.println("Enter another integer ");
   data = input.nextInt();
   count++;
   if(data == 42) {
       break;
   }
}