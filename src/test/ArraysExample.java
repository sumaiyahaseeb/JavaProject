package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 20, 30, 40, 50, 60 };
		System.out.println(a.length);
		System.out.println(a[1]);
		System.out.println(a[a.length - 1]);

		String[] s = { "mon", "tue", "wed", "thurs", "fri" };
		System.out.println(s[1]);
		System.out.println(s[2]);

		// identify the no of words in a string

		String str = "my name is sumaiya fathima";

		String[] array = str.split(""); // this will divide the string with spaces {"my" ,"name"
										// ,"is","sumaiya","fathima"}
		System.out.println(array); // this wont work that is why we need to use looping concept

		System.out.println(array.length);

	}
}
