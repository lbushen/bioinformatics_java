import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {13,44,66,3};
		int total = 0;
		/*
		for (int i = 0; i < num.length; i++){
			System.out.println(num[i]);	
		}
		*/

		System.out.println("There are"+num.length+" elements");		

		//enhanced for loop
		for(int x: num){
			total+=x;
		}

		System.out.println("The sum is "+total);
	}


}