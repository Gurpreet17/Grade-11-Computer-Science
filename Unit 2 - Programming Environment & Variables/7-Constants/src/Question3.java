import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double PI;
		PI=3.14159;
		double radius;
		System.out.println("Enter the radius of the circle:");
		radius = input.nextDouble();
		double area;
		area = PI*Math.pow(radius,2);
		System.out.println("The area of a circle with a radius of " + radius + " is " + area );
		
		

	}

}
