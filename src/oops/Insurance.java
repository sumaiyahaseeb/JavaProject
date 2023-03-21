package oops;

public class Insurance extends Citizen {
	
	public int insuranceid;
	
	public Insurance() {
		super(); //calls the default constructor of parent class
		System.out.println("inside default constroctor of insurance");
	}
	
	public void print() {
		super.print(); //it will print the method of immediate parent first
		System.out.println("insurance id is " +insuranceid);
	}
	
	public void print(String message) {
		System.out.println("typing some message "+message);
	}
	

}
