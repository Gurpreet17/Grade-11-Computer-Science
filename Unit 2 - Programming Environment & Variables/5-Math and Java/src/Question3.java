import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double inches;
        double desklenght;
		System.out.println("Enter desk length in inches");
		inches = input.nextDouble();
		desklenght = 2.54*inches;
		System.out.println("Desk lenght = " + desklenght);


	}

}
