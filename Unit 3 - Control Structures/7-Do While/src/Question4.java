import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String response;
		do {
			System.out.println("Continue? Enter no to stop");
			response = input.nextLine();
			System.out.println("Your response was " + response);
			
		}
		while (response.equals("yes"));

	}

}
