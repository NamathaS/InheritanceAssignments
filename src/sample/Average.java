package sample;

public class Average {
	
	public double number1;
	public double number2;
	public double number3;
	public double average;
	
	Average(){}
	
	Average(double no1,double no2,double no3){
		number1=no1;
		number2=no2;
		number3=no3;
		average=calculateAverage();
	}
	
	public double calculateAverage() {
		double avg= (this.number1+this.number2+this.number3)/3;
		return avg;
	}
	
	public void displayAverage() {
		System.out.println("Average of "+number1+" , "+number2+" , "+number3+" is "+average);
	}
	
	
	

}
