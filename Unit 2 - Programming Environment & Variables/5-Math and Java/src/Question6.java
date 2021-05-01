import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double hours;
		int days;
		double rhour; //remainding hours
		System.out.println("Enter the total number of hours:");
		hours = input.nextDouble();
		days = (int) (hours/24);
		rhour = (hours%24);
		System.out.println("There are " + Math.floor(days) + " days and          "+ rhour + " hours in " + hours + " hours.");


	}

}
