/*
program to count words from a user input file
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class wordcount{

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the name of the sequence file: ");
			String myfile = input.nextLine();
	
			// modified from tutorialspoint
			//https://www.tutorialspoint.com/how-to-read-contents-of-a-file-using-scanner-class
			//code to store file contents in a string from user input
			try (InputStream inputStream = new FileInputStream(myfile)){ //Creating the File object
		      
		      Scanner scan = new Scanner(inputStream);//Create a Scanner object
		      
		      StringBuffer sb = new StringBuffer();//StringBuffer to store the contents of scanner
		      //Appending each line to the buffer
		      while(scan.hasNext()) {//adds file contents to sb object line by line
		         sb.append(scan.nextLine());
		      }
		      StringBuffer str = new StringBuffer(sb);//create buffer object
	
		      String s= str.toString();
		      int countWords = s.split("\\s").length;
				System.out.println("The file contains " +countWords+ " words.");
			}
			catch(IOException e){
				System.out.println("\nFile not found");
			} 
	}
}