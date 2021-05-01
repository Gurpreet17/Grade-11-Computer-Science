import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double cones,bonus;
		System.out.println("Enter the number of cones sold:");
		cones = input.nextInt();
		if (cones>=150) {
			if (cones>350) {
				bonus = (((cones-350)*0.35)+10);
				System.out.println("He will earn $" + bonus + " If he sells " + cones + " cones.");
			}
			else if (cones>=250) {
			bonus = (((cones-250)*0.25)+10);
			System.out.println("He will earn $" + bonus + " If he sells " + cones + " cones.");
		    }
			else if (cones>=150) {
			bonus = (((cones-150)*0.10)+10);
			System.out.println("He will earn $" + bonus + " If he sells " + cones + " cones.");
		    }
	     }
		
		else {
			System.out.println("invalid input of cones");
		}
	}

}
