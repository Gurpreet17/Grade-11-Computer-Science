import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int year;
		int current;
		int age;
		current = 2020;
		System.out.println("Enter birth year:");
		year = input.nextInt();
		age = (current-year);
		System.out.println("You must be " + age + " old.");


	}

}
