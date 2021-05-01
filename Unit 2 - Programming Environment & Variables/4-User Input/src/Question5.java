import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		float hours;
		float days;
		System.out.println("Enter the total number of hours");
		hours =input.nextFloat();
		days = hours/24;
		System.out.println("There are " + days + " in " + hours);


	}

}
