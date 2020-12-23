package sample;

public class Student {
	 public int RollNumber;
	 public String Name;
	 public long PhoneNumber;
	 public String Address;
	 
	 public Student () {}
	 
	 public Student(int rollno, String name,long phonenumber,String address) {
		 
		 RollNumber=rollno;
		 Name=name;
		 PhoneNumber=phonenumber;
		 Address=address;
	 }
	 
	 public void setRollNumber(int rollno) {
		 RollNumber=rollno;
	 }
	 public void setName(String name) {
		 Name=name;
	 } 
	 public void setPhoneNumber(long phonenumber) {
		 PhoneNumber=phonenumber;
	 } 
	 public void setAddress(String address) {
		 Address=address;
	 }
	 public int getRollNumber( ) {
		 return RollNumber;
	 }
	 public String getName( ) {
		 return Name;
	 } 
	 public long getPhoneNumber( ) {
		 return PhoneNumber;
	 } 
	 public String getAddress( ) {
		 return	Address;
	 }
	 
	 public void displayStudentDetails() {
		 System.out.println(Name +"'s  ID is "+RollNumber);
		 System.out.println("And his contact details are below");
		 System.out.println("Address " + Address +" and contact number is "+PhoneNumber);
	 }

}
