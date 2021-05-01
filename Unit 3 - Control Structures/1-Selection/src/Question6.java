import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter a number");
		number = input.nextInt();
		if (number%5==0){
			System.out.println(number + " is divisible by 5.");
		}
		else {
			System.out.println(number + " is not divisible by 5.");
		}
		

	}

}
