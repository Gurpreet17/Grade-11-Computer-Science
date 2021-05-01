import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		/*
		Scanner input = new Scanner (System.in);
		int[] numbers = new int [16];
		int track=0;
		for (;track<numbers.length; track++) {
			System.out.println("Enter an integer");
			numbers[track] = input.nextInt();
		}
		System.out.println("The integers entered include:");
		for (int x=0; x<track; x++) {
			System.out.println(numbers[x]);
		}
		 */
		
		Scanner input = new Scanner (System.in);
		int[] numbers = new int [16];
		int track=0;
		for (;track<numbers.length; track++) {
			System.out.println("Enter an integer");
			numbers[track] = input.nextInt();
		}
		System.out.println("The integers entered include:");
		for (int x=15; x>=0;) {
			System.out.println("Enter an integer");
			numbers[track] = input.nextInt();
		}

		

	}

}
