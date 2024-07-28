import java.io.*;
import java.util.*;
import java.lang.*;

public class createfile{

	private Formatter x;

	public void openFile(){ // method to create a file we can use

		try{//creates a file or override a file if it already exists
			x = new Formatter("nevermind.txt");	
		}
		catch(Exception e){
			System.out.println("You got an error");
		}
	}

	public void addRecord(){

		x.format("%s%s%s", "46 ", "Lee ", "Bushen\n");
		x.format("%s%d%s%s", "This ", 4, " is another ", "line");
	}

	public void closeFile(){

		x.close();
	}

	public static void main(String[] args) {
		
		//create object with no argument because no
		//constuctor was made/needed
		createfile weird = new createfile();
		weird.openFile();
		weird.addRecord();
		weird.closeFile();
	}
}
