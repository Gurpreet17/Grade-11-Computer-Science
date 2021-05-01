import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String entry;
		do {
			System.out.println("Enter first mark:");
			double mark1 = input.nextDouble();
			System.out.println("Enter second mark:");
			double mark2 = input.nextDouble();
			System.out.println("Enter third mark:");
			double mark3 = input.nextDouble();
			System.out.println("Enter fourth mark:");
			double mark4 = input.nextDouble();
			double average = (mark1+mark2+mark3+mark4)/4;
			if ((average<=100) && (average>=0)) {
				System.out.println("The average of this student is " + average);
			}
			System.out.println("Would you like to input makrs for another students?");
			entry = input.next();
		}
		while (!entry.equals("finished"));

	}

}
