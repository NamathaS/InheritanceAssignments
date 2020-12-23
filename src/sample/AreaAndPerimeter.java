package sample;

public class AreaAndPerimeter {
	
	public double Length;
	public double Breadth;
	public double Area;
	public double Perimeter;
	
	
	public AreaAndPerimeter() {}
	
	public AreaAndPerimeter(double length, double breadth) {
		Length=length;
		Breadth=breadth;
		Area=calculateArea();
		Perimeter=calculatePerimeter();
	}
	
	public double calculateArea() {
		return Length*Breadth;
	}
	
	public double calculatePerimeter() {
		return 2*(Length+Breadth);
	}
	
	public void displayDetailes() {
		
		System.out.println(" Area of Rectangle with Length"+Length+" and Breadth "+Breadth+" is "+Area);
		System.out.println(" And Perimeter  "+Perimeter);
	}
}
