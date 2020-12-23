package sample;

import java.util.Scanner;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String FirstName;
	String LastName;
	String Gender;
	int Age ;
	long ContactNumber;
	String Address;
	String EmailAddress;
	int StudentId;
	String MainCourse;
	double Mark1;
	double Mark2;
	double Mark3;
	char Grade;
	int TeacherId;
	String Department;
	String Subject1;
	String Subject2;
	String Subject3;
	double Salary;
	
	System.out.println("Please enter following student details");
	
	System.out.println("FirstName :");
	FirstName = sc.nextLine();
	
	System.out.println("LastName :");	
	LastName=sc.nextLine();
	
	System.out.println("Gender :");
	Gender=sc.nextLine();
	
	System.out.println("Age :");
	Age=sc.nextInt();
	
	System.out.println("ContactNumber :");
	ContactNumber=sc.nextLong();
	
	System.out.println("Address :");
	Address=sc.next();
	
	System.out.println("EmailAddress :");
	EmailAddress=sc.next();
	
	System.out.println("StudentId :");
	StudentId=sc.nextInt();
	
	System.out.println("MainCourse :");
	MainCourse=sc.next();
	
	System.out.println("Mark1 :");
	Mark1=sc.nextDouble();
	
	System.out.println("Mark2 :");
	Mark2=sc.nextDouble();
	
	System.out.println("Mark3 :");
	Mark3=sc.nextDouble();
	
	System.out.println("Grade :");
	Grade=sc.next().charAt(0);
	
	System.out.println("TeacherId :");
	TeacherId=sc.nextInt();
	
	System.out.println("Department :");
	Department=sc.next();
	
	System.out.println("Subject1 :");
	Subject1=sc.next();
	
	System.out.println("Subject2 :");
	Subject2=sc.next();
	
	System.out.println("Subject3 :");
	Subject3=sc.next();
	
	System.out.println("Salary :");
	Salary=sc.nextDouble();
	System.out.println(" Single inheritance ....Person->Student");
	
	Students student1 = new Students(FirstName, LastName,Gender, Age, ContactNumber,Address,EmailAddress,StudentId, MainCourse, Mark1,Mark2, Mark3, Grade); 
	
	student1.displayStudent();	
	
	System.out.println(" Hierarchical inheritance ....Person->Teacher");
	
	Teacher teacher1 = new Teacher(FirstName, LastName,Gender, Age, ContactNumber,Address,EmailAddress, Department, Salary); 
	
	teacher1.displayTeacher();
	
	System.out.println(" Multi level  inheritance ....Person->Teacher ->computer teacher");
	
	ComputerTeacher teacher2 = new ComputerTeacher(FirstName, LastName,Gender, Age, ContactNumber,Address,EmailAddress, TeacherId, Department, Subject1,Subject2, Subject3, Salary); 
	
	teacher2.displayComputerTeacher();	
	
	}
}
