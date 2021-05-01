import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		double mark;
		System.out.println("Enter student number:");
		number = input.nextInt();
		System.out.println("Enter mark");
		mark = input.nextDouble();
		if (mark>=50){
			System.out.println("Satisfactory");
			}
		else {
			System.out.println("unsatisfactory - parental interview required.");
			
			
		}
		

	}

}
