import java.util.Scanner;
public class Main_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int option;
		do {
			Option();
			option = input.nextInt();
			if (option==1) {
				System.out.println("Enter the cost of the item:");
				double item = input.nextDouble();
				System.out.println("Enter the total amount :");
				double total = input.nextDouble();
				System.out.println("The total is $" + AddItem(item,total)); 
			}
			else if (option==2){
				System.out.println("Enter the total amount purchase so far:");
				double total = input.nextDouble();
				System.out.println ("Tax: $" + CalculateTax(total));
			}
			else if (option==3) {
				System.out.println("Enter the total amount purchase so far:");
				double total = input.nextInt();
				System.out.println("Enter discount you want:");
				double discount = input.nextDouble();
				System.out.println("Discount: $" + CalculateDiscount(total,discount));
			}
		}
		while (option!=4);{
			System.out.println("Enter the total amount purchase:");
			double total = input.nextInt();
			System.out.println("Enter discount you want:");
			double discount = input.nextDouble();
			System.out.println("Final total: $" + CalculateFinalTotal(total, discount));
		}
			
	}
	public static void Option () {
		System.out.println("1 – Add an item");
		System.out.println("2 – Display Tax ");
		System.out.println("3 – Set discount");
		System.out.println("4 – Calculate final total");
		System.out.println("Enter option:");
	}
	
	public static double AddItem (double item, double total) {
		double sum = item + total;
		return sum;
	}
	
	public static double CalculateTax (double t) {
		double HST = 1.13;
		double tax = t*HST;
		return tax;
	}
	
	public static double CalculateDiscount(double t, double discount) {
		String discountString = Double.toString(discount);
		double length = discountString.length();
		if (length>=0 || length<=1) {
			double discountPurchase = t*discount;
			return discountPurchase;
		}
		else {
			double noDiscount = -1;
			return noDiscount;
		}
	}
	
	public static double CalculateFinalTotal(double total, double discount) {
		double finalTotal = ((total-(total*discount))*1.13);
		return finalTotal;
	}

}
