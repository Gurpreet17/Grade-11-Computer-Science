import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner input = new Scanner(System.in);
		double [] price = new double[10];
		int track=0;
		for (; track<price.length; track++) {
			System.out.println("Enter price " + track);
			price [track] = input.nextDouble();
		}
		System.out.println("The contents of price include:");
		for (int x=0;x<track;) {
			System.out.println(price[x]);
			x++;
		}
		*/
		
		Scanner input = new Scanner(System.in);
		double [] price = new double[10];
		int track=0;
		for (; track<price.length; track++) {
			System.out.println("Enter price " + track);
			price [track] = input.nextDouble();
		}
		track--;
		System.out.println("The contents of price include:");
		for (int x=0;x<=track;) {
			System.out.println(price[track]);
			track--;
		}
	}

}
