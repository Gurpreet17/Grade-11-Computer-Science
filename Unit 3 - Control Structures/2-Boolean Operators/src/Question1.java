import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age;
		double discount,price,total;
		price = 9.95;
		discount = 0.20;
		System.out.println("Enter the age of the moviegoer:");
		age = input.nextInt();
		if ((12>=age)||(65<=age)){
			total = price-(price*discount);
			System.out.println("This moviegoer qualifies for a discount rate.");
			System.out.println("The final price is $" + Math.round(total*100)/100.0);
		}
		else {
			System.out.println("This moviegoer does not qualifies for a discount rate.");
			System.out.println("The final price is $" + price);
		}
		
		
	}

}
