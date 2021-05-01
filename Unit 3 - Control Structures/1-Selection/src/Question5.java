import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double purchases, subtotal, total;
		final double TAX = 0.13;
		final double DISCOUNT = 0.15;
		final double PLACE = 100;
		System.out.println("Enter the total purchases made:");
		purchases = input.nextDouble();
		if (purchases>100) {
			subtotal = (purchases-(purchases*DISCOUNT));
			total = (subtotal+(subtotal*TAX));
			System.out.println ("Subtotal with discount: $" + Math.round(subtotal*PLACE)/100.0);
			System.out.println ("Total after taxes: $" + Math.round(total*PLACE)/100.0);
			}
		else {
			total = (purchases+(purchases*TAX));
			System.out.println("Total purchases: $" + Math.round(purchases*PLACE)/100.0);
			System.out.println("Total after taxes: $" + Math.round(total*PLACE)/100.0);
			
			
			
			
		}
		
		

	}

}
