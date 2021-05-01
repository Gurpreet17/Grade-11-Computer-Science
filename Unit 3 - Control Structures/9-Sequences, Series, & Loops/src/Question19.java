import java.util.Scanner;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double mortgage = 225000;
		double interestRate = 0.0675;
		double principalPayment = 25000; 
		for (double year=1,endingBalance=0; year<=10; year++,mortgage=endingBalance) {
			double interest = mortgage*interestRate;
			endingBalance = mortgage-principalPayment;
			System.out.println(year + "\t\t" + Math.round(mortgage*100)/100.0 + "\t\t" + Math.round(interest*100)/100.0 + "\t\t" + principalPayment + "\t\t" + Math.round(endingBalance*100)/100.0);
		}
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how much should be borrowed:");
		double mortgage = input.nextDouble();
		System.out.println("Enter interest rate:");
		double interestRate = input.nextDouble();
		System.out.println("how much should be paid back every year:");
		double principalPayment = input.nextDouble();
		for (double year=1,endingBalance=0; year<=10; year++,mortgage=endingBalance) {
			double interest = mortgage*interestRate;
			endingBalance = mortgage-principalPayment;
			System.out.println(year + "\t\t\t" + Math.round(mortgage*100)/100.0 + "\t\t\t" + Math.round(interest*100)/100.0 + "\t\t\t" + principalPayment + "\t\t\t" + Math.round(endingBalance*100)/100.0);
	}

}}
