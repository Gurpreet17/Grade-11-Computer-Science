import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		int base;
		int exponent;
		System.out.println("Enter base:");
		base = input.nextInt();
		System.out.println("Enter exponent");
		exponent = input.nextInt();
		System.out.println(base + " to the power of " + exponent + " is " + Math.pow(base, exponent));


	}

}
