package finalDataSt;

public class Main {
	public static void main(String[] args) {
	
		
		
		
		RecursiveMaxFinder p15 = new RecursiveMaxFinder();
		
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int index = 4;
	    int result = p15.findMaxRecursive(arr, index);
	    System.out.println("The maximum value in the array up to index " + index + " is: " + result);
	    
	    PalindromeChecker p2=new PalindromeChecker();
	   System.out.println(p2.palindrome("1221")); 
		
	}
}
