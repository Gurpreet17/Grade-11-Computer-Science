import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double height;
		double length;
		double hypotenuse;
		System.out.println ("Enter the height of the triangle:");
		height = input.nextDouble();			
		System.out.println ("Enter the length of the triangle:");
		length = input.nextDouble();
		hypotenuse = (Math.pow(height, 2)+Math.pow(length, 2));
		hypotenuse = Math.sqrt(hypotenuse);
		System.out.println("The hypotenuse of the right angle triangle is    " + Math.floor(hypotenuse));


	}

}
