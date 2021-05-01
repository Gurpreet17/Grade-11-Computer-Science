import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		float minutes;
		float days;
		System.out.println("Enter the total number of minutes");
		minutes = input.nextFloat();
		days = (minutes/(60*24));
		System.out.print("There are " + days + " days"+ " in " + minutes + " minutes.");


	}

}
