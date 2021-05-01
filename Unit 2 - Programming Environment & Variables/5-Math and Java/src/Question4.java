import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		double celcius;
		double fahrenheit;
		System.out.println("Enter Celsius");
		celcius = input.nextDouble();
		fahrenheit = (((9.0/5.0)*celcius)+32);
		System.out.println (celcius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit.");


	}

}
