package sample;

public class Person {
	public String FirstName;
	public String LastName;
	public String Gender;
	public int Age;
	public long ContactNumber;
	public String Address;
	public String EmailAddress;
	
	public Person() {}
	
	public Person(String FirstName,	String LastName, String Gender,	int Age, long ContactNumber, String Address, String EmailAddress) {
		
		this.FirstName		= FirstName;
		this.LastName		= LastName;
		this.Gender			= Gender;
		this.Age			= Age;
		this.ContactNumber	= ContactNumber;
		this.Address		= Address;
		this.EmailAddress	= EmailAddress;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName	= FirstName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public void setGender(String Gender) {
		this.Gender	= Gender;
	}
	public void setAge(int Age) {
		this.Age = Age;
	}	
	public void setContactNumber(long ContactNumber) {
		this.ContactNumber = ContactNumber;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}
	
	public String getFirstName() {
		return this.FirstName;
	}
	public String getLastName( ) {
		return this.LastName;
	}
	public String getGender( ) {
		return this.Gender;
	}
	public int getAge( ) {
		return this.Age;
	}	
	public long getContactNumber( ) {
		return this.ContactNumber;
	}
	public String getAddress( ) {
		return this.Address;
	}
	public String getEmailAddress( ) {
		return this.EmailAddress;
	}
	public void displayPersonDetails() {
		System.out.println("Person  Details ");
		System.out.println("..................");
		System.out.println("");
		System.out.println("Full Name :"+FirstName+LastName);
		System.out.println("Gender :"+Gender);
		System.out.println("Age :"+Age);
		System.out.println("Contact Number :"+ContactNumber);
		System.out.println("Address :"+Address);
		System.out.println("Email Address : "+EmailAddress);
		System.out.println("");
	}
}
