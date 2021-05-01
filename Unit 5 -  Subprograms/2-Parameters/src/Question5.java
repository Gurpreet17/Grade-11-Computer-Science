import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter grade:");
		double value = input.nextDouble();
		Grade(value);

	}
	public static void Grade(double value) {
		if (value>=50 && value<=100 && value>=0) {
			System.out.println("Student has passed");
		}
		else if (value<50 && value<=100 && value>=0) {
			System.out.println("Student has failed");
		}
		else {
			System.out.println("Error");
		}
	}

}
