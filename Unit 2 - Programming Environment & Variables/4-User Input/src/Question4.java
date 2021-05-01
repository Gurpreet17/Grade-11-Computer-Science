import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		int mass;
		int acceleration;
		int force;
		System.out.println("Enter the object’s mass in kg");
		mass = input.nextInt();
		System.out.println("Enter the object’s acceleration in m/s");
		acceleration = input.nextInt();
		force = mass*acceleration;
		System.out.print("The force of the object with a mass of " + mass + " and acceleration of " + acceleration + "m/s is " + force + "N");


	}

}
