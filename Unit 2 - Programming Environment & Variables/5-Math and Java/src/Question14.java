import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double bat;
		double singles;
		double doubles;
		double triples;
		double homeruns;
		double battingaverage;
		double sluggingaverage;
		System.out.println("Enter the number of times at bat:");
		bat = input.nextDouble();
		System.out.println("Enter the number of times at singles:");
		singles = input.nextDouble();
		System.out.println("Enter the number of times at doubles:");
		doubles = input.nextDouble();
		System.out.println("Enter number of times at triples:");
		triples = input.nextDouble();
		System.out.println("Enter number of home runs:");
		homeruns = input.nextDouble();
		battingaverage = ((singles+doubles+triples+homeruns)/bat);
		sluggingaverage = (((singles)+(doubles*2)+(triples*3)+(homeruns*4))/bat);
		System.out.println("The batting average is " + Math.round(battingaverage));
		System.out.println("The slugging average is " + Math.round(sluggingaverage));






	}

}
