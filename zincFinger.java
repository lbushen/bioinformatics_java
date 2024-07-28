import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.io.*;




class zincFinger{
/*
	public void check (ArrayList<String> arr, String str){

		int index=0;
		int ind2=0;
		
		Pattern patternZ = Pattern.compile("C[A-Z]{2}C[A-Z]{17}C[A-Z]{2}C"); 
		Matcher matchZ = patternZ.matcher(arr);
		
		for (String s : arr) {
                if (arr.contains(matchZ)) {
                    index = arr.indexOf(str);
					ind2 = index - 1;
					break;
				} else{
					continue;	
				}
			}
      
		System.out.println(arr.get(ind2));
		System.out.println("Contains zinc finger site: " + matchZ);

		for (String list: arr.get(index)){
			string+= list;
		}

		System.out.println("At locations\n" + matchZ.start()+ " " + matchZ.end());
		}

	//static public ArrayList<String>finger = new ArrayList<String>();
*/

	//ArrayList<String>zincy = new ArrayList<String>();

	//ArrayList<String>tempstr = new ArrayList<String>();

	public static void main(String[] args)
	throws IOException
	{
	//public void openFile(){
		
	ArrayList<String>zincy = new ArrayList<String>();

	ArrayList<String>tempstr = new ArrayList<String>();
		BufferedReader bf = new BufferedReader(new FileReader("zincFinger.txt"));
		
		String line = bf.readLine();
		
		while(line != null) {
				
			tempstr.add(line);
			line = bf.readLine();
		}

		bf.close();

		String string = "";
		
		for (String list: tempstr){
			string+= list;
		}
		
		//Path filename = Path.of("C:\\java_test\\Java_Hwk04\\zincFinger.txt");
		//String tempstr = Files.readString(filename);
		
		String zincStr = string.replace("\n", "");
		
		Pattern p1 = Pattern.compile(">.+]|[A-Z]+"); 
		Matcher m1 = p1.matcher(zincStr);
		
		while (m1.find()) {
		zincy.add(m1.group());
		//zincy.add(m1.group(2));
		}
		
		System.out.println(zincy);
		//System.out.println(zincStr);
}
}

// drop sequence that contains zincfinger regex into a string to find the positionPath filename = Path.of("C:\\java_test\\Java_Hwk04");
		
		
		
		//Pattern p1 = Pattern.compile("[a-z]{2}[0-9]{2}[a-z][0-9]{2}.[a-z][0-9]|[ATGC]+"); 
		//Matcher m1 = p1.matcher(s);