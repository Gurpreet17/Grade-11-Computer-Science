import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int option;
		System.out.println("Enter option:");
		option = input.nextInt();
		switch (option) {
		case 1:  System.out.println ("Load game");
				 break;
		case 2:  System.out.println ("Start Game");
		         break;
		case 3:  System.out.println("Credits");
		         break;
		default: System.out.println ("Quit");
				 break;
		}

	}

}
