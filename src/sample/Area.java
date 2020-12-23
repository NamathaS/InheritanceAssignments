package sample;

import java.util.Scanner;

public class Area {
	
	Scanner keyboard = new Scanner(System.in);

	public double Length;
	public double Breadth;
	
	public Area() {}
	
	public Area(double len, double bred) {
		Length=len;
		Breadth=bred;
	}
    
    public double getLength()
    {
    	return Length;
    }
    public double getBreadth()
    {
    	return Breadth;
    }
    public void setLength(double len)
    {
    	Length=len;
    }
    public void setBreadth(double breadth)
    {
    	Breadth=breadth;
    }
	public double returnArea() {
		
		return this.Length * this.Breadth;
	}
}
