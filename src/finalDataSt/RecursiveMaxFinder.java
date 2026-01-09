package finalDataSt;

public class RecursiveMaxFinder {
	public static int findMaxRecursive(int[] arr, int index) {
		if (index <= 0) {
			return arr[0];
		}
		int m1 = findMaxRecursive(arr, index - 1);
		int m2 = findMaxRecursive(arr, index - 2);
		int m3 = findMaxRecursive(arr, index - 4);

		if (m1 > m2)
			return m1;
		else if (m2 > m3)
			return m2;
		else 
			return m3;
	}

}
