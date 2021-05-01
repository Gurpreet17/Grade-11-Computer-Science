import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height;
		System.out.println("Enter the height of a right-angled triangle:");
		height = input.nextDouble();
		final double BASE;
		BASE = 10.5;
		double area;
		area = BASE*height*1/2;
		System.out.println("The area a the triangle with the height of " + height + " and base of " + BASE + " is " +  area);
		
		
		

	}

}
