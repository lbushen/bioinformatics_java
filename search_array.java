// Java program to check whether
// an element is present in array or not
 
import java.util.Arrays;
import java.util.stream.IntStream;
 
class search_array {
    //modified from 
    //https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/
    // Function return true if given element
    // found in array
    private static void check(String[][] arr, String toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (String [] element : arr) {
            for(String data: element){
                if (data == toCheckValue) {
                    System.out.println(data.findIndex(toCheckValue));
                    test = true;
                    break;
                }
            }
        }
    
        // Print the result
        if (test != true){
        System.out.println("The sequence id: "+ toCheckValue
                           + " entered is not in the file.");
        }
    }
    public static void main(String[] args)
    {
 
        // Get the array
        String arr[][] = {{ "1", "Lee", "AAAAAAAA" },
                        {"2", "Laura", "TTTTTT" },
                        {"3", "Andrew", "GGGGGGGG"}};
 
        // Get the value to be checked
        String toCheckValue = "Laura";
 
        // Print the array
        //System.out.println("Array: "+ Arrays.toString(arr));
 
        // Check if this value is
        // present in the array or not
        check(arr, toCheckValue);
    }
}


/*
for (String [] element : arr) {
            for(String data: element){
                if (data == toCheckValue) {
                    System.out.println(new)
                    test = true;
                    break;
                }
            }
        }
*/