import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] dial = new int[9];
		int option;
		int speeddial1 = 0;
		int speeddial2;
		do {
			System.out.println("Option 1: Enter a number");
			System.out.println("Option 2: Dial a number");
			System.out.println("Option 3: exit");
			System.out.println("Enter option:");
			option = input.nextInt();
			if (option==1) {
				System.out.println("Enter the speed-dial location (0 to 9");
				speeddial1 = input.nextInt();
				System.out.println("Enter the telephone number:");
				dial[speeddial1] = input.nextInt();
			}
			if (option==2) {
				System.out.println("Enter the speed-dial number:");
				speeddial2 = input.nextInt();
				if (speeddial2==speeddial1) {
				System.out.println("Dialing the number " + dial[speeddial2]);
			}
			}

			else if (option==3) {
				System.out.println("Exit");
			}
		}
		while (option!=3);


	}

}
