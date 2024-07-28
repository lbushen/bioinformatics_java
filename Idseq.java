import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


class Idseq{

	public void check (ArrayList<String> arr, String str){

		int index=0;
		int ind2=0;
		
		
		for (String s : arr) {
                if (arr.contains(str)) {
                    index = arr.indexOf(str);
					ind2 = index + 1;
					break;
				} else{
					continue;	
				}
			}
      
		System.out.println(">" + str);
		System.out.println(arr.get(ind2));
		}  


	public static void main(String[] args)
		throws IOException 

		{

		ArrayList<String>listofStrings = new ArrayList<String>();
		ArrayList<String>matchesList = new ArrayList<String>();
		
		BufferedReader bf = new BufferedReader(new FileReader("seq.fasta"));
		

		String line = bf.readLine();

		while(line != null) {
			listofStrings.add(line);
			line = bf.readLine();
		
		}
		bf.close();
		//convert arraylist to string

		String string = "";
		//replace line breads:
		for (String list: listofStrings){
			string+= list;
		}

		String s = string.replace("\n", "");

		//System.out.println(s);
		
		
		Pattern p1 = Pattern.compile("[a-z]{2}[0-9]{2}[a-z][0-9]{2}.[a-z][0-9]|[ATGC]+"); 
		Matcher m1 = p1.matcher(s);
		
		while (m1.matches()) {
		matchesList.add(m1.group());
		}
	
		//System.out.println(matchesList);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the sequence file: ");
		String name = input.nextLine();
		
		Idseq nucleotide = new Idseq();

		nucleotide.check(matchesList,name);
	}
}