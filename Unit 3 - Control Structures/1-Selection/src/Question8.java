import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double PAY,OVERTIME;
		double hours,pay,overtime,grosspay;
		PAY=14.50;
		OVERTIME = 17;
		System.out.println("Enter the total number of hours worked");
		hours = input.nextDouble();
		if (hours>40) {
			overtime = ((hours-40)*OVERTIME);
			pay = (40*PAY);
			grosspay = (pay+overtime);
			System.out.println("The gross weekly pay is $" + grosspay);
		}
		else {
			pay = (hours*PAY);
			grosspay=pay;
			System.out.println("The gross weekly pay is $" + grosspay);
			
		}
		

	}

}
