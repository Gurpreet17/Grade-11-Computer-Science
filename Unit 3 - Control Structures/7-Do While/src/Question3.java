import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int integer;
		do {
			System.out.println("Enter integer:");
			integer = input.nextInt();
			System.out.println("Your integer was " + integer);
		}
		while (integer!=-1000);

	}

}
