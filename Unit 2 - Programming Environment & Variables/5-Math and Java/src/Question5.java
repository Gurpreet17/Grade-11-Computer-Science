import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double speed1;
		double speed2;
		double time;
		double distance;
		System.out.println("Enter first speed:");
		speed1 = input.nextDouble();
		System.out.println("Enter second speed:");
		speed2 = input.nextDouble();
		System.out.println("Enter total distance:");
		distance = input.nextDouble();
		time = (distance/((speed1+speed2)/2));
	    System.out.println("She was running for " + Math.floor (time) + "         hours");


	}

}
