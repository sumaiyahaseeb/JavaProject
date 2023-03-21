package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "sumaiya";
		String name2 = "ayaz is in mom place";

		System.out.println("the no of char in first string 1 s:" + name1.length());
		System.out.println("the no of char in first string 2 s:" + name2.length());

		System.out.println("the position of character:" + name2.charAt(5));

		// dynamically last letter

		System.out.println("the position of character:" + name2.charAt(name2.length() - 1));

	}

}
