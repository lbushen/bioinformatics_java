import java.util.*;
import java.io.*;

public class readFile{

	public static void main(String[] args){

		try{
			File x = (new File("seq.fasta"));
			Scanner myReader = new Scanner(x);
			while(myReader.hasNextLine()){//loop through the end of the file
				String data = myReader.nextLine();
				System.out.println(data);
			}
		myReader.close();
		}

		catch(Exception e){
			System.out.println("file does not exist in this filepath");
		}
	}

}