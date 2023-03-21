package oops;

public class Employee {

	public String Name;
	public int empid;
	private static int salary = 50000;

	public Employee() { // default constructor
		System.out.println("inside default constructor");
	}

	public Employee(String Name, int no) {
		System.out.println("inside parameterized constructor");
		this.Name = Name;
		this.empid = no;
	}

	public void DisplayName() {
		System.out.println("name of employee is :" + Name);
	}

	public static void DisplaySalary() {
		System.out.println("employee salary is : " + salary);
	}

}
