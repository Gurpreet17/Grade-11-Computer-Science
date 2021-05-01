import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double HST;
		HST= 0.13;
		double price;
		System.out.println("Enter the price of an item:");
		price = input.nextDouble();
		double tax;
		tax = price*HST;
		double total;
		total = price+tax;
		int place;
		place = 100;
	    System.out.println("The final price of an item with a subtotal of $" + price + " is $" + Math.round(total*place)/100.0);

	}

}
