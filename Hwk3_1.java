/*
Class Name:BIFS 618
Homework assignment3, questions 1 and 1
File name: Hwk3_1.java
Program author name: Lee Bushen
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class Hwk3_1{

	public String s;

	//create ArrayList ojects for each reading frame
	public ArrayList<String> codons1 = new ArrayList<String>();
	public ArrayList<String> codons2 = new ArrayList<String>();
	public ArrayList<String> codons3 = new ArrayList<String>();

	//constructor method
	Hwk3_1 (String seq){
		s = seq;
	}
	
	//create method for finding 3 reading frames, printing
	// them separated by space, and storing them in an ArrayList

	public ArrayList<String> codon (int rf){

		//create regex pattern for finding A, G, T, C
		Pattern p1 = Pattern.compile("[AGTC][AGTC][AGTC]");
		
		//conditional dependent on argument
		if (rf == 1){
			
			Matcher m1 = p1.matcher(s); 

			System.out.println("\nReading frame #1 codons are: ");
			while (m1.find()){
				System.out.print(m1.group() + " ");// printing codons
				codons1.add(m1.group()); //adding them into Array	
			}
		return codons1;

		} else if (rf == 2){
			//start at second character of s and make a substring
			String rf2 = s.substring(1,s.length());
			Matcher m2 = p1.matcher(rf2); 

			System.out.println("\n\nReading frame #2 codons are: ");
			while (m2.find()){
				System.out.print(m2.group() + " ");
				codons2.add(m2.group());	
			}
		return codons2;

		} else if (rf == 3){
			//start at third character of s and make a substring
			String rf3 = s.substring(2,s.length());
			Matcher m3 = p1.matcher(rf3);

			System.out.println("\n\nReading frame #3 codons are: ");
			while (m3.find()){
				System.out.print(m3.group() + " ");
				codons3.add(m3.group());	
			}
			
		}
		return codons3;
	}

	//create method to align codon with single letter amino acid

	public void codon2aa(ArrayList<String> codons){
		
		System.out.print("\n");
		for(int i = 0; i < codons.size(); i++){//loop through arrays

		switch (codons.get(i)){
			// single letter AA descriptions:
		// https://www.hgvs.org/mutnomen/codon.html#aalist

		case "GCA": System.out.print("A   "); break;
		case "GCC": System.out.print("A   "); break;
		case "GCG": System.out.print("A   "); break;
		case "GCT": System.out.print("A   "); break;
		
		
		case "TGC": System.out.print("C   ");break;
		case "TGT": System.out.print("C   ");break;

		case "GAC": System.out.print("D   ");break;
		case "GAT": System.out.print("D   ");break;
		
		case "GAA": System.out.print("E   ");break;
		case "GAG": System.out.print("E   ");break;
					
		case "TTC": System.out.print("F   ");break;
		case "TTT": System.out.print("F   ");break;
					
		case "GGA": System.out.print("G   ");break;
		case "GGC": System.out.print("G   ");break;
		case "GGG": System.out.print("G   ");break;
		case "GGT": System.out.print("G   ");break;
					
		case "CAC": System.out.print("H   ");break;
		case "CAT": System.out.print("H   ");break;
					
		case "ATA": System.out.print("I   ");break;
		case "ATC": System.out.print("I   ");break;
		case "ATT": System.out.print("I   ");break;
						
		case "AAA": System.out.print("K   ");break;
		case "AAG": System.out.print("K   ");break;
				
		case "CTA": System.out.print("L   "); break;
		case "CTC": System.out.print("L   "); break;
		case "CTG": System.out.print("L   "); break;
		case "CTT": System.out.print("L   "); break;
		case "TTA": System.out.print("L   "); break;
		case "TTG": System.out.print("L   "); break;
					
		case "ATG": System.out.print("M   "); break;
					
		case "AAC": System.out.print("N   ");break;
		case "AAT": System.out.print("N   ");break;
					
		case "CCA": System.out.print("P   "); break;
		case "CCC": System.out.print("P   "); break;
		case "CCG": System.out.print("P   "); break;
		case "CCT": System.out.print("P   "); break;
					
		case "CAA": System.out.print("Q   ");break;
		case "CAG": System.out.print("Q   ");break;
					
		case "AGA": System.out.print("R   ");break;
		case "AGG": System.out.print("R   ");break;
		case "CGA": System.out.print("R   ");break;
		case "CGC": System.out.print("R   ");break;
		case "CGG": System.out.print("R   ");break;
		case "CGT": System.out.print("R   ");break;
					
		case "AGC": System.out.print("S   ");break;
		case "AGT": System.out.print("S   ");break;
		case "TCA": System.out.print("S   ");break;
		case "TCC": System.out.print("S   ");break;
		case "TCG": System.out.print("S   ");break;
		case "TCT": System.out.print("S   ");break;
				
		case "ACA": System.out.print("T   ");break;
		case "ACC": System.out.print("T   ");break;
		case "ACG": System.out.print("T   ");break;
		case "ACT": System.out.print("T   ");break;
					
		case "GTA": System.out.print("V   ");break;
		case "GTC": System.out.print("V   ");break;
		case "GTG": System.out.print("V   ");break;
		case "GTT": System.out.print("V   ");break;
					
		case "TGG": System.out.print("W   ");break;
	
		case "NNN": System.out.print("X   ");break;
				
		case "TAC": System.out.print("Y   ");break;
		case "TAT": System.out.print("Y   ");break;
			
		case "TAA": System.out.print("*   ");break;
		case "TAG": System.out.print("*   ");break;
		case "TGA": System.out.print("*   ");break;
	
		default:
			System.out.println("Amino acid not found");
			}

		}
	}
}	
