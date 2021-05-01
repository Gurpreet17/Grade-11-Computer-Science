import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
        int age;
		int hours;
	    int startage;
	    int totalhour;
	    startage = 2;
        System.out.print("Enter age:");
	    age = input.nextInt();
	   System.out.print("Enter number of TV hours watched per day");
	   hours = input.nextInt();
	   totalhour = ((age - startage) * (365*hours));
	   System.out.print("You’ve watched approx " + totalhour + " hours           in your life");


	}

}
