package oops;

public class Citizen extends Person {

	public int SSN;

	public Citizen() {
		super();
		System.out.println("inside default constructor of citizen");

	}

	public Citizen(String name, String countryname, int age, int ssn) {
		super();
		System.out.println("inside paraeterized constructor");
		this.Name = name;
		this.countryname = countryname;
		this.age = age;
		this.SSN = ssn;

	}

	public void print() {
		System.out.println(" SSN is " + SSN);
	}
}
