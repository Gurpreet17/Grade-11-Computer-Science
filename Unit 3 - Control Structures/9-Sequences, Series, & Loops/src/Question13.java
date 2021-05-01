import java.util.Scanner;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first value:");
		int first = input.nextInt();
		System.out.println("Enter last value");
		int last = input.nextInt();
		System.out.println("Enter common ratio:");
		int rat = input.nextInt();
		int sum =0;
		for (; first<=last;first*=rat) {
			sum=sum+first;
			System.out.println(first);
		}
	   System.out.println("The sum is " + sum);
	}

}
