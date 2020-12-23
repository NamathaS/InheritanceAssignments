package sample;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class CoreClass {
	
	static Scanner sc = new Scanner(System.in);
	static final float pi=3.14f;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		//Assignment One
		/*System.out.println("  Assignment One   ");
		System.out.println("'''''''''''''''''''''");
		Employee emp = new Employee(2,"Bob");
		emp.displayEmployeeDetails();
		
		System.out.println("");
		
		//Assignment Two
		System.out.println("  Assignment Two   ");
		System.out.println("'''''''''''''''''''''");
		Product prod1 = new Product(101,"Table","Furniture",1500);
		prod1.displayProductDetails();
		
		System.out.println("");
		
		Product prod2 = new Product(102,"Vegetables","Food",15);
		prod2.displayProductDetails();
		
		System.out.println("");
		
		//Assignment Three
		System.out.println("  Assignment Three   ");
		System.out.println("'''''''''''''''''''''");
		Average avg= new Average(2.5,3.7,9.8);
		avg.displayAverage();
		
		
		System.out.println("");
		
		//Assignment Four
		System.out.println("  Assignment Four   ");
		System.out.println("'''''''''''''''''''''");
		AreaAndPerimeter AP= new AreaAndPerimeter(4,5);
		AP.displayDetailes();
		System.out.println("");
		AreaAndPerimeter AP1= new AreaAndPerimeter(5,8);
		AP1.displayDetailes();
		
		System.out.println("");
		
		
		//Assignment Six
		NumberHolder num= new NumberHolder(4,5.6f);
		System.out.println(num.getAnInt());
		System.out.println(num.getAFloat());
		
		
		System.out.println("");
		
		//Assignment Seven
	
		System.out.println("");
		
		Student Stud1= new Student(34,"Sam",987623334,"23 Hayson Street");
		Stud1.displayStudentDetails();
		
		Student Stud2= new Student(55,"John",88623334,"12 Sun Street");
		Stud2.displayStudentDetails();
	
		System.out.println("");
		
		//Assignment Eight
		
		findAreaOfRectangle();
		
		//Assignment nine
		
		reverseTheGivenString();
		
		// Assignment Ten
		countVowelsAndConsonants();	
		
		//Assignment Eleven
		reverseStringWithStringBuilder();

		//Assignment Twelve
		checkPalidrome();

		//Assignment thirteen
		replacePatternInString();
		
		//Assignment fourteen
		System.out.println("Count of words : "+countNumberOfWords());
		
		//Assignment Fifteen
		 
		checkFirstStringContainSecond();
				
		//Assignment Sixteen
		swapTwoStringWithOutThirdVariable();
		
		//Assignment Seventeen
		readNumberAndString();
		
		//Assignment Eighteen 
		readIPAddress();
		
		//Assignment nineteen
		findAreaOfRectangle();
		
		//Assignment Twenty 
		calcuateAreaOFSquare();
		
		//Assignment Twenty one
		calculateAreaOfTriangle();
	
		//Assignment twenty two

		calcualateAreaAndCircumference();	
		
		//Assignment twenty three
		calcuateAverageWithArray();
		
		//Assignment twenty four
		calcuateAveragewhileEntering();*/
		
		//Assignment Twenty six
		charArrayToString();
		
		
		
	}
	private static void charArrayToString() {
		// TODO Auto-generated method stub
		char[] charArray= new char[] {'h','e','l','l','o',' ','w','o','r','l','d','!'};
		String str= new String(charArray);
		System.out.println(str);
		
	}
	private static void calcuateAveragewhileEntering() {
		// TODO Auto-generated method stub
		int limit = 0;
		double sum=0,average;
		
		System.out.println("Please enter the limit");
		limit=sc.nextInt();
		
		for(int i=0;i<limit;i++) {
			sum+=sc.nextDouble();
		}
		System.out.println("Sum of entered numbers is :"+sum);
		
		average=sum/limit;
		System.out.println("Average of numbers is :"+average);		
	}
	private static void calcuateAverageWithArray() {
		// TODO Auto-generated method stub

		int limit,sum=0;
		System.out.println("Please enter limit :");
		limit = sc.nextInt();
		int [] numbers = new int[limit];
		for(int i=0;i<limit;i++) {
			numbers[i]=sc.nextInt();
			sum=sum+numbers[i];
		}
		double average = sum/limit;
		System.out.println("Average of numbers is :"+average);	
	}
	private static void calcualateAreaAndCircumference() {
		// TODO Auto-generated method stub
		
		double radius,area,circumference;
		System.out.println("Please enter side :");
		radius = sc.nextDouble();
		area = pi*radius;
		circumference= 2*pi*radius;
		
		System.out.println(" Area of Circle is "+area);
		
		System.out.println(" Circumference of Circle is "+circumference);		
	}
	private static void calcuateAreaOFSquare() {
		// TODO Auto-generated method stub
		double side,area;
		System.out.println("Please enter side :");
		side = sc.nextDouble();
			
		area= side*side;
		
		System.out.println("Area of the square is : "+area);
	}
	private static void calculateAreaOfTriangle() {
		// TODO Auto-generated method stub
		double base , height,area;
		System.out.println("Please ente base :");
		base = sc.nextDouble();
		
		System.out.println("Please enter height :");
		height=sc.nextDouble();
		
		area=(base*height)/2;
		
		System.out.println("Area of the triangle is : "+area);
		
	}
	private static void readIPAddress() {

		InetAddress ipObj = null;
		
		try {
			
			ipObj = InetAddress.getLocalHost();
		}
		catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println(ipObj.getHostAddress());
	}
	private static void readNumberAndString() {
		// TODO Auto-generated method stub
		System.out.println("Please enter string");
		String StringInput = sc.nextLine();
		
		System.out.println("Please enter number ");
		int intinput=sc.nextInt();
		
		System.out.println("Entered string  input "+StringInput);
		System.out.println("Entered int  input "+intinput);
		
	}
	private static void swapTwoStringWithOutThirdVariable() {
		// TODO Auto-generated method stub
		int length;
		String comb;
		System.out.println("Please enter first string :");
		String first = sc.nextLine();
		
		System.out.println("Please enter second string :");
		String second =sc.nextLine();
		
		length = first.length();
		first = first+second;
		
		second = first.substring(0, length);
		first=first.substring(length);
		
		System.out.println("First String : "+first+"  Second String :"+second);
		
	}
	private static void checkPalidrome() {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter input to check palidrome :");
		String input = sc.nextLine();
			
		if(input.equals(new StringBuilder(input).reverse().toString())) {  
			System.out.println("Entered input is a palidrome ");
		}
		else {
			System.out.println("Entered input is not a palidrome ");
		}	
	}
	private static void reverseTheGivenString() {
		// TODO Auto-generated method stub
		System.out.println("Please enter value : ");
		
		String input = sc.nextLine();
		
		char[] ch = input.toCharArray();
		
		for(int i =input.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
	private static void findAreaOfRectangle() {
		// TODO Auto-generated method stub
		System.out.println("Enter Length");
		double length= sc.nextDouble();
		
		System.out.println("Enter breadth");
		double breadth = sc.nextDouble();
		
		Area Rec= new Area(length,breadth);
		
		System.out.println("Area is "+Rec.returnArea());
		
	}
	private static void reverseStringWithStringBuilder() {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse using string builder:");
		
		StringBuilder str = new StringBuilder(sc.nextLine()); 

		StringBuilder ReverseStr = str.reverse(); 

		// print string 
		System.out.println("Reverse String = "+ ReverseStr.toString());
		
		
	}
	private static void checkFirstStringContainSecond() {
		// TODO Auto-generated method stub
		System.out.println("Please enter first string  :");
		String first = sc.nextLine();
		
		System.out.println("Please enter second string :");
		String second =sc.nextLine();
		
		if(first.contains(second)) {
			System.out.println(first +" string contains "+second);
		}
		else {
			System.err.println(first +" string doesn't contain "+second);
		}
		
		
	}
	private static int countNumberOfWords() {
		// TODO Auto-generated method stub
		System.out.println("Please enter input to count words : ");
		String input = sc.nextLine();
		if (input == null || input.isEmpty()) {
			return 0;
		} 
		
		String[] words = input.split("\\s+");
		return words.length;

	}
	private static void replacePatternInString() {
		
		System.out.println("Enter input to remove pattern :");
		String inp = sc.nextLine();
		
		System.out.println("Enter pattern");
		String pattern = sc.nextLine();
		
		System.out.println(inp.replace(pattern, ""));	
	}
	public static void countVowelsAndConsonants() {
		
		int vowel=0,consonant=0;
	
		System.out.println("Please enter input to count vowels and consonants : ");
		String input = sc.nextLine();
		
		char[] ch = input.toCharArray();
		
		for(int i =0;i<input.length();i++) {
		
			switch(ch[i]) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
						vowel++;
						break;
				default:
						consonant++;
			}
		}
		System.out.println("Given string have "+vowel+" vowels  and "+consonant+" consonants");
	}
	
}
