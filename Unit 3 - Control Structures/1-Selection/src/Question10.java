import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double A,B,C,area,herons;
		System.out.println("Enter side A:");
		A = input.nextDouble();
		System.out.println("Enter side B:");
		B = input.nextDouble();
		System.out.println("Enter side C:");
		C = input.nextDouble();
		if (Math.pow(C,2) == Math.pow(A,2) + Math.pow(B,2)){
			System.out.println("This is a right-angled triangle.");
			area = (0.5*A*B);
			System.out.println("The area of the triangle is " + area);
		}
		else {
			System.out.println("This is a non-right triangle.");
			herons = (0.5*(A+B+C));
			area = Math.sqrt(herons*(herons-A)*(herons-B)*(herons-C));
			System.out.println("The area of the triangle is " + area);
		}
		

	}

}
