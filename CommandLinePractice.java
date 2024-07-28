public class CommandLinePractice{
	
	public static void main(String[] args){

		System.out.println("The grades are");

		for(String s : args)
			System.out.println(s);
		
	}
}