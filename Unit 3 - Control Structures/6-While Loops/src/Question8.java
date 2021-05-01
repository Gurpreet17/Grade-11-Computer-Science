import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter a number:");
		number = input.nextInt();
		while (number!=0) {
			System.out.println("Two times the number is " + number*2);
			System.out.println("Three times the number is " + number*3);
			System.out.println("Enter a number:");
			number = input.nextInt();
		}
		
	
		}
		

	}

	
