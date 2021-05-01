import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mark;
		System.out.println("Enter a mark out of 100:");
		mark = input.nextDouble();
		if ((mark>=90) && (mark<=100)) {
			System.out.println("The Letter for a " + mark + " is a A");
		}
		else if ((mark>=80) && (mark<=89)) {
			System.out.println("The Letter for a " + mark + " is a B");
		}
		else if ((mark>=70) && (mark<=79)) {
			System.out.println("The Letter for a " + mark + " is a C");
		}
		else if ((mark>=60) && (mark<=69)) {
			System.out.println("The Letter for a " + mark + " is a D");
		}
	    else if ((mark>=0) && (mark<59)) {
	    	System.out.println ("The Letter for a " + mark + " is a F");
	    }
	}
}
