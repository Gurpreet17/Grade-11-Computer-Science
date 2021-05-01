import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int c = 1;
		String wish;
		System.out.println("I am so smart");
		System.out.println("Do you wish to continue?");
		wish = input.nextLine();
		while (wish.equals("yes")){
			System.out.println("I am so smart");
			c=c+1;
			System.out.println("Do you wish to continue?");
			wish = input.nextLine();
		}
		if (wish.equals("no")) {
			System.out.println("Number of times the loop was executed: " + c);
		}

		}

		
		
		
		
		
		

	}


