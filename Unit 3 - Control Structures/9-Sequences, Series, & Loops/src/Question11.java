import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the number of terms:");
		int n = input.nextInt();
		System.out.println("Enter the first value:");
		int a = input.nextInt();
		System.out.println("Enter the difference between terms ");
		int d = input.nextInt();
		int Sn = ((n/2)*(2*a + (n-1)*d));
		System.out.println("The sum is " + Sn);

	}

}
