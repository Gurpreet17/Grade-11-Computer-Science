import java.util.Scanner;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double moneyInAccount=100;
		double interest=5;
		double totalInterest=0;
		for (double interestRate=0.05,year=1; year<=5; year++) {
			interest = moneyInAccount * interestRate; 
			totalInterest = totalInterest + interest;
			moneyInAccount = moneyInAccount+interest;
		}
		System.out.println("The total interest earned is $" + Math.round(moneyInAccount*100)/100.0);
		*/ 
		//part a
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter money in the Account:");
		double moneyInAccount = input.nextDouble();
		System.out.println("Enter interest rate:");
		double interestRate = input.nextDouble();
		double totalInterest=0;
		for (Double interest=0.0,year=1.0; year<=5; year++) {
			interest = moneyInAccount * interestRate; 
			totalInterest = totalInterest + interest;
			moneyInAccount = moneyInAccount+interest;
	    }
		System.out.println("The total interest earned is $" + Math.round(totalInterest*100)/100.0);
		System.out.println("After 5 years there are $" + Math.round(moneyInAccount*100)/100.0 + " in the account");

}}
