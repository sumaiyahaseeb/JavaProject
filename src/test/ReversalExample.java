package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Nitin";
		String res = ""; // temporary variable

		for (int i = s.length() - 1; i >= 0; i--) {
			res = res + s.charAt(i);
		}
		System.out.println(res);

		if (s.equalsIgnoreCase(res)) {

			System.out.println("string is palindrome");
		} else
			System.out.println("string is not palindrome");

		// ======================reverse a string by word

		String str = "sumaiya meets faiza";

		String[] arr = str.split(" ");

		String result = "";

		for (int i = arr.length - 1; i >= 0; i--) {

			result = result + arr[i] + " ";
		}

		System.out.println("The result is " + result.trim());

	}

}