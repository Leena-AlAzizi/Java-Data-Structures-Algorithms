package finalDataSt;

public class PalindromeChecker {

	public static boolean palindrome(String word1) {
		String word= word1.toLowerCase();
		int length = word.length();
		char[] arr = new char[length];
		for (int i = 0; i < length; i++) {
			arr[i] = word.charAt(length - 1 - i);
		}

		for (int i = 0; i < length; i++) {
			if (arr[i] != word.charAt(i)) {
				return false;
			}

		}

		return true;
	}

}
