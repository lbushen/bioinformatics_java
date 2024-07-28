/* Week2 in-class exercise
   Name: Week5Average.java
   Author: Rayan Shadman
   Date: 02/12/2023

*/
package Week5Average;

import java.util.Scanner;
import java.io;

public class Week5Average {

	public static void main(String[] args) {
	}
	 int sum=0,i,count=0,max,min,n;
     n=3;
     float avg;
     if (args.length == 0)
     System.out.println(“The answer is:“);
   else{
     String[] args = null;
 i = args.length;
 max = Integer.parseInt(args[0]);
 min = Integer.parseInt(args[0]);
 while(count < i){
     n = Integer.parseInt(args[count]);
     sum += n;
     if(min > n)
         min = n;
     if (max < n)
         max = n;
     count += 1;}
 avg = sum/i;
 System.out.println(“The sum is ” +sum);
 System.out.println(“The average is” + avg);
 System.out.println(“The maximum is” + max);
 System.out.println(“The minimum is” + min);

}
}
