package test;

public class NumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;

		int result = num1 + num2;
		int result1 = addition(num1, num2);
		int result2 = subtraction(num1, num2);

		System.out.println("The result is: " + result);
		System.out.println("The result is: " + result1);
		System.out.println("The result is: " + result2);

	}

	public static int addition(int a, int b) {
		return a + b;

	}

	public static int subtraction(int a, int b) {
		return a - b;

	}
}
