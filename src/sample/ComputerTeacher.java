package sample;

public class ComputerTeacher extends Teacher{
	
	public int ComputerTeacherId;
	public String Subject1;
	public String Subject2;
	public String Subject3;

	
	public ComputerTeacher() {}
	
	public ComputerTeacher(String FirstName,	String LastName, String Gender,	int Age, long ContactNumber, String Address, 
			String EmailAddress, int ComputerTeacherId, String Department, String Subject1, String Subject2,String Subject3,double Salary) {
		
		super(FirstName,LastName, Gender, Age, ContactNumber, Address, EmailAddress, Department, Salary);
		
		this.ComputerTeacherId = ComputerTeacherId;
		this.Subject1 = Subject1;
		this.Subject2 =Subject2;
		this.Subject3 = Subject3;
	}
	
	public void displayComputerTeacher() {
		
		super.displayTeacher();
		System.out.println("Computer Teacher Details ");
		System.out.println(".......................");
		System.out.println("");
		System.out.println("ComputerTeacher Id :"+ComputerTeacherId);
		System.out.println("Subject1 :"+Subject1);
		System.out.println("Subject2 :"+Subject2);
		System.out.println("Subject3 :"+Subject3);
		System.out.println("");
	}	
}
