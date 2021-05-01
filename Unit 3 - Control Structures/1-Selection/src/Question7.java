import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.println("Enter a value for x for the formula y = (5x+l)/(x-6):");
		x = input.nextDouble();
		if (x==6) {
			System.out.println("y is underfined.");
		}
		else {
			y = ((5*x+1)/(x-6));
			System.out.println("The value for y is " + y);
		}
		
		

	}

}
