package test;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop

		int i = 1;
		System.out.println(++i);
		System.out.println(i++);

		while (i < 11) {
			System.out.println(i);
			i++;
		}
		System.out.println("end of while loop");

		// 10 to 1 using while loop

		int j = 10;
		while (j > 0) {

			System.out.println(j);
			j--;

		}
		System.out.println("end of loop");

		// to skip if 5 comes

		int j1 = 10;
		while (j1 > 0) {

			if (j1 == 5) {
				System.out.println("skip");
				j1--;
				continue;
			}

			System.out.println(j1);
			j1--;

		}
		System.out.println("end of loop");

		// to stop when 5 comes

		int j2 = 10;
		while (j2 > 0) {

			if (j2 == 5) {
				System.out.println("stop");
				break;
			}

			System.out.println(j2);
			j2--;

		}
		System.out.println("end of loop");

	}
}