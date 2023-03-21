package test;

public class PrimeNumbCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 14;

		boolean flag = true;

		for (int i = 2; i <= number / 2; i++) {

			int rem = number % i;

			if (rem == 0) {

				flag = false;
				break;
			}
		}

		if (flag == true) {

			System.out.println("Num is prime num");
		} else {
			System.out.println("Num is not a prime num");
		}

	}

}
