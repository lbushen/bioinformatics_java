import java.util.Arrays;

public class LinearSearch {

	static int[] linearSearch(int[][] arr1, int target)

	{
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		String arr[][] = { { "1", "Lee", "AAAAAA" }, { "2", "Laura", "GGGGGGGG" }, { "3", "Sam", "TTTTTTTTT" },
				{ "4", "Andrew", "CCCCCCCC" } };
		int arr1[][] = { { 3, 1, 4 }, { 10, 22, 36 }, { 99, 201, 66 } };
		int target = 201;
		int ans[] = linearSearch(arr1, target);
		System.out.println("Element found at index: " + Arrays.toString(ans));
	}
}
