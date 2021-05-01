import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String ID,password;
		int chances;
		chances = 3;
		do {
			System.out.println("Enter ID number:");
			ID = input.nextLine();
			System.out.println("Enter password:");
			password = input.nextLine();
			chances = chances-1;
			if (chances<=0) {
				System.out.println("Access denied");
			}
			if (ID.equals("12345") && password.equals("pass") && chances!=0) {
				System.out.println("Identity confirmed");
			}
	    }
		while (!ID.equals("12345") && !password.equals("pass") && chances!=0);
		
		
		
	
		

	}

}
