import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class RegexFasta{

	public static void main(String[] args){

		ArrayList<String>matchesList = new ArrayList<String>();

		String seq = """
		>by21f03.y1|BF727444
		CACCAGCTCAGCACCGCCGTGCGCCCAGCCAGCCATGGGGAATTCACCCC
TCTACGAGGACCGGGGCTTCCAGGGCCGCCACTACGAATGCAGCAGCGAC
CACCCCAACCTGCAGCCCTACTTGAGCCGCTGCAACTCGGCGCGCGTGGA
CAGCGGCTGCTGGATGCTCTGGAATTCCAGCCCAACTACTCGGGCCTCCA
ACTTCCTGCGCCGCGGCGACTATGCCGACCACCAGCAGTGGATGGGCCTC
AGCGACTCGGTCCGCTCCTGCCGCCTCATCCCCCACTCTGGCTCTCACAG
GATCAGACTCTATGAGAGGGAGGACTACAGAGGCCAGATGATAGAGTTCA
CTGAGGACTGCTCCTGGAATTCAGGACCGCT
>by05e12.y1|BF726365
CCGCCGTGCGCCCAGCCAGCCATGGGGAAGATCACCCTCTACGAGGACCG
GGGCTTCCAGGGCCGCCACTACGAATGCAGCAGCGACCACCCCAACCTGC
AGCCCTACTTGAGGAATTCGAACTCGGCGCGCGTGGACAGCGGCTGCTGG
ATGCTCTATGAGCAGCCCAACTACTCGGGCCTCCAGTACTTCCTGCGCCG
CGGCGACTATGCCGACCACCAGCAGTGGATGGGCCTCAGCGACTCGGTCC
GCTCCTGCCGCCTC""";

		// regex to search id:
	//for (int i = 0; i < seq.length(); i++){
		//if (seq.startsWith(">")){
			//id regex:

			String text = readFileAsString("seq.fasta");
			text = text.replace("\n", "").replace("\r", "");
			
			Pattern p1 = Pattern.compile("[a-z]{2}[0-9]{2}[a-z][0-9]{2}.[a-z][0-9]"); 
			Matcher m1 = p1.matcher(text);
			Pattern p2 = Pattern.compile("[ATGC]+");
			Matcher m2 = p2.matcher(text);
			while (m1.find()) {
    		matchesList.add(m1.group());
    		}
			while (m2.find()) {
	    		matchesList.add(m2.group());
	    	}
			//}
			//regex for 1 line of nucleotides
			
    	System.out.println(matchesList);
    	
    	/*
		
		idea to concat lines together:
			if line ends with [ATGC] and next line begins with [ATGC] then concat

			String text = readFileAsString("seq.fasta");
			text = text.replace("\n", "").replace("\r", "");

    	int sizeOfNewArray = matchesList.size(); 
		String newArrayOfMatches[] = new String[sizeOfNewArray]; 
		matchesList.toArray(newArrayOfMatches);

		System.out.println(newArrayOfMatches);
		*/

		
	}
}

// if line starts with ">" parse [a-z]{2}[0-9]{2}[a-z][0-9]{2}.[a-z][0-9] add to arrayList [0]
// if line doesn't start with ">" concatenate lines and add to arrayList [1]