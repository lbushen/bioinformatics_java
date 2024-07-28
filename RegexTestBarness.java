import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestBarness {
    
        public static void main(String[] arg) {
                 Scanner input = new Scanner(System.in);
                while (true) {
                    System.out.println("Enter a regex pattern: ");
                    String regex = input.nextLine();
                    
                    // Create a regex pattern
                    Pattern pt = Pattern.compile(regex);
                    
                    System.out.println("Enter a input string to search: ");
                    String sr = input.nextLine();
                    
                    // Create a Matcher object
                    Matcher mt = pt.matcher(sr);

                    boolean found = false;
                    while (mt.find()) {
                        System.out.printf("I found the text \"%s\" starting at " +
                                          "index %d and ending at index %d.\n",
                                          mt.group(), mt.start(), mt.end());
                        
                        found = true;
                    }
                    
                    if(!found){
                        System.out.println("No match found.");
                    }
                }
        }
}