import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double height;
		double diameter;
		double volume;
		double area;
		diameter = 10;
		System.out.println ("Enter the height of the can:");
		height = input.nextDouble();
		area = 3.14159*Math.pow(5, 2);
		volume = (area*height);
		System.out.println("The volume of the can is " + volume + "cm");


	}

}
