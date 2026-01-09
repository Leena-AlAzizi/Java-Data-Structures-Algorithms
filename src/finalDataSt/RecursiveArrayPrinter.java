package finalDataSt;

public class RecursiveArrayPrinter {
	public static void function2() {
		System.out.println("lets start ^-^");
	}

	public static void function1(int arr[], int i) {
		if (i < 0)
			function2();
		else {
			function1(arr,i-1);
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		function1(arr,4);
		function2();

	}
}

