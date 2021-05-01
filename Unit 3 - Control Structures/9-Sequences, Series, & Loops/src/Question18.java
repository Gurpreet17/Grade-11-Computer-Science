import java.util.Scanner;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double moneyInAccount=1000;
		double interest=40;
		double totalInterest=0;
		double startingBalance=0;
		for (double interestRate=0.04,year=1; year<=10;  year++) {
			startingBalance=moneyInAccount;
			interest = moneyInAccount * interestRate; 
			totalInterest = totalInterest + interest;
			moneyInAccount = moneyInAccount+interest;
			System.out.println(year + "\t\t" + Math.round(startingBalance*100)/100.0 + "\t\t" + Math.round(interest*100)/100.0 + "\t\t" + Math.round(moneyInAccount*100)/100.0);
        }
        */
		//part a
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount to deposit:");
		double moneyInAccount = input.nextDouble();
		System.out.println("Enter interest rate:");
		double interestRate = input.nextDouble();
		System.out.println("Enter how many years the money should be left in the account:");
		double years = input.nextDouble();
		double totalInterest=0;
		double startingBalance=0;
		for (double time=1; time<=years; time++) {
			startingBalance=moneyInAccount;
			double interest = moneyInAccount * interestRate; 
			totalInterest = totalInterest + interest;
			moneyInAccount = moneyInAccount+interest;
			System.out.println(time + "\t\t" + Math.round(startingBalance*100)/100.0 + "\t\t" + Math.round(interest*100)/100.0 + "\t\t" + Math.round(moneyInAccount*100)/100.0);
	}

}}
