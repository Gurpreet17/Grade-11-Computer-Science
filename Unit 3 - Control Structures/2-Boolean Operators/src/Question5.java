import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String ID, password;
		System.out.println("Enter ID:");
		ID = input.nextLine();
		System.out.println("Enter password:");
		password = input.nextLine();
		if (ID.equals("555555") && password.equals("PASSWORD")) {
			System.out.println("password successful, access granted");
		}
		else {
			System.out.println("Access denied. Password incorrect.");
		}
	}

}
