package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 11; i++) {
			System.out.println(i);

		}
		System.out.println("end of for loop");

		// 10 to 1 print

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("end of for loop");

		// only even nos from 10 to 1 using only increment and decrement

		for (int i = 10; i > 0; i -= 2) { // i-=2

			System.out.println(i);
		}
		System.out.println("end of for loop");

		// only even nos from 10 to 1

		for (int i = 10; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("end of for loop");

		// print table of 2

		System.out.println("Table of two");
		int num = 2;
		for (int i = 1; i < 11; i++) {
			System.out.println(num * i);
			// System.out.printf("%d * %d = %d \n" , num , i, num*i);
		}
		System.out.println("End Table of 2");

		// print elements of array

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

		// print value using for each loop
		System.out.println("print value using for each loop");

		int[] a2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int val : a2) {
			System.out.println(val);
		}

		// print each char in a string

		String s = "sumaiya";

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}
}