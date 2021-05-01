import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cones;
		double bonus;
		System.out.println("Enter the number of cones sold:");
		cones = input.nextInt();
		 if (cones>350) {
			bonus = (cones*0.35);
			System.out.println("He will earn $" + bonus + " if he sells " + cones + " cones.");
		 }
		 else if (cones>250) {
				bonus = (cones*0.25);
				System.out.println("He will earn $" + bonus + "if he sells " + cones + " cones.");
		}
		 else if (cones>150) {
				bonus = (cones*0.10);
				System.out.println("He will earn $" + bonus + "if he sells " + cones + " cones.");
		}
		 else {
			 System.out.println("Error, invalid amount of cones sold");
		 }
		
		
		
		

	
		
		

	}

}
