package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your age ");

		age = scanner.nextInt();

		if (age < 17) {
			System.out.println("you are not eligible to vote");
		} else if (age == 17) {
			System.out.println("you will be eligible to vote next year");
		} else
			System.out.println("you are eligible to vote");

		scanner.close();
		// for less memory

	}

}
