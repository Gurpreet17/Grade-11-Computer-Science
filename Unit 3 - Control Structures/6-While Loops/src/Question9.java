import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double test,score;
		System.out.println("Enter what a test is out of:");
		test = input.nextDouble();
		score=0;
		while (score>=0 && (score<=test)) {
			System.out.println("Enter scores of students:");
			score = input.nextDouble();
			System.out.println("The score of the student is " + (score/test)*100 + "%");
		}
		}
	}


