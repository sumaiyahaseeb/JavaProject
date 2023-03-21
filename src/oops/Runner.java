package oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		emp1.Name = "sumaiya";
		emp1.empid = 928;
		emp1.DisplayName();

		Employee emp2 = new Employee();
		emp2.Name = "haseeb";
		emp2.empid = 918;
		emp2.DisplayName();

		Employee emp3 = new Employee("Ayaz", 345);
		emp3.DisplayName();

		Employee.DisplaySalary();*/

		
        System.out.println("***********creating citizen1**********");
		Citizen c1 = new Citizen();
		c1.age = 19;
		c1.Name = "ajay";
		c1.countryname = "india";
		c1.SSN=90;
		c1.print();
		
		System.out.println("***********creating citizen2**********");
		Citizen c2 = new Citizen("ammi", "india", 48, 8970);
		c2.print();

		System.out.println("***********creating in1 **********");
		Insurance in1 = new Insurance();
		in1.insuranceid = 3000;
		in1.SSN=999;
		in1.print(); // preference will be given to the method of the insurance class first then the
					// parent class its extending.
		in1.print("method overriding example");
		
		
		//creating object of abstract class with its child class
		
		AxisBank bank= new AxisBank();
		bank.display();
		
		EncapsulationExample enc=new EncapsulationExample();
		enc.setSalary(50000);
		
		System.out.println(enc.getSalary());

	}

}
