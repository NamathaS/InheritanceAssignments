package sample;

public class Teacher extends Person{
	
	public String Department;
	public double Salary;
	
	public Teacher() {}
	
	public Teacher(String FirstName,	String LastName, String Gender,	int Age, long ContactNumber, String Address, 
			String EmailAddress,String Department,double Salary) {
		
		super(FirstName,LastName, Gender, Age, ContactNumber, Address, EmailAddress);
		
		this.Department = Department;
		this.Salary = Salary;
	}
	
	public void displayTeacher() {
	
		super.displayPersonDetails();
		System.out.println("Teacher Details ");
		System.out.println("..................");
		System.out.println("");
		System.out.println("Department :"+Department);
		System.out.println("Salary : "+Salary);
		System.out.println("");
	}	
}
