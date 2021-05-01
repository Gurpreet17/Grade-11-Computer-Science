import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String password;
      		System.out.println ("Enter password:");
		password = input.next();
		if (password.equals("PASSWORD")){
			System.out.println("password successful, access granted”.");
		}
		else {
			System.out.println("password denied");
		}

	}
}
