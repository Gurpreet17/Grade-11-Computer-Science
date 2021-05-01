import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double price;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Price");
		price = s.nextDouble();
		price = price * 1.13;
		System.out.println("Pice with tax is:" + price);

		

	}

}
