import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double integer,total,average;
		total=0;
		for (Double track=0.0; track<=9; track++) {
			System.out.println("Enter integer:");
			integer = input.nextDouble();
			total=total+integer;
		}
		average = total/10;
		System.out.println("The aveage is " + average);
		    

	}

}
