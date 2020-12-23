package sample;

public class Employee {
	public int empNo;
	public String EmpName;
	
	Employee(){}
	Employee(int no, String name){
		this.empNo=no;
		this.EmpName=name;
	}
	public void displayEmployeeDetails() {
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+EmpName);
	}

}
