package sample;

public class Students extends Person{
	
	public int StudentId;
	public String MainCourse;
	public double Mark1;
	public double Mark2;
	public double Mark3;
	public char Grade;
	
	public Students() {}
	
	public Students(String FirstName,	String LastName, String Gender,	int Age, long ContactNumber, String Address, 
			String EmailAddress,int StudentId, String MainCourse, double Mark1, double Mark2,double Mark3, char Grade) {
		
		super(FirstName,LastName, Gender, Age, ContactNumber, Address, EmailAddress);
		
		this.StudentId = StudentId;
		this.MainCourse = MainCourse;
		this.Mark1 = Mark1;
		this.Mark2 =Mark2;
		this.Mark3 = Mark3;
		this.Grade = Grade;
	}
	
	public void displayStudent() {
		
		super.displayPersonDetails();
		System.out.println("Student Details");
		System.out.println(".................");
		System.out.println("");
		System.out.println("Student Id :"+StudentId);
		System.out.println("MainCourse :"+MainCourse);
		System.out.println("Mark1 :"+Mark1);
		System.out.println("Mark2 :"+Mark2);
		System.out.println("Mark3 :"+Mark3);
		System.out.println("Grades : "+Grade);
		System.out.println("");
	}
	
	
	
	
	
}
