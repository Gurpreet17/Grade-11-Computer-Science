import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double heigth;
		double length;
		double hypotenuse;
		System.out.println("Enter the heigth of the triangle:");
		heigth = input.nextDouble();
		System.out.println("Enter hypotenuse of the triangle:");
		hypotenuse = input.nextDouble();
		length = (Math.pow(hypotenuse, 2)+Math.pow(heigth, 2));
		length = Math.sqrt(length); 
        System.out.println("The length of a right angle triangle is " +  Math.floor(length));


	}

}
