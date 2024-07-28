import java.io.File;
import java.util.*;

public class FileTest{

	public static void main(String[] args){

		File myName = new File("C:\\java_test\\pimple.txt");

		// find if that file exists
		if (myName.exists()) {
			System.out.println(myName.getName() + " exists");
		} else {
			final Formatter x;

			try{
				x = new Formatter("pimple.txt");
				System.out.println("You created a file!");
			}
			catch (Exception e){
				System.out.println("You got an error");
			}
		}



	}

}