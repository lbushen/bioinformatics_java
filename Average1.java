// program to average unlimit number of command line arguments

public class Average1{
	
	public static void main(String[] args){

		double sum = 0; //initialize sum variable
		System.out.println("The grades entered: ");

		//create array to store commandline arguments
		double[] grade = new double[args.length]; 

		//loop to convert commandline args to doubles
		for (int i = 0; i < args.length; i++) {
    		grade[i] = Double.parseDouble(args[i]);
    		System.out.println(grade[i]);
		}

		//loop to add each array element and store in 'sum'
		for (double num : grade){
			sum += num;
		}

		double avgGrade = sum / grade.length;//find average

		System.out.printf("Average grade: %.1f\n",avgGrade);
		System.out.println("=================");
		System.out.println("Author: Lee Bushen");

	}

}