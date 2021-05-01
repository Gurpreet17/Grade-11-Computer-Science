import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length,width,area;
		System.out.println("Enter the length of a rectangle:");
		length = input.nextDouble();
		System.out.println("Enter the width of a rectangle:");
		width = input.nextDouble();
		if ((length<0)||(width<0)) {
			System.out.println("Error: there cannot be a negative side length for a rectangle");
		}
		else {
			area = (length*width);
			System.out.println("The area of the rectangle is " + area);
			}

	}

}
