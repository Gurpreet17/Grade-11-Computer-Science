import java.util.Scanner;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int integer,sum,mod;
		sum=0;
		do {
			System.out.println("Enter integer:");
			integer=input.nextInt();
			
		}
	   while (integer<=0);{
		   
	   }
	   int length = String.valueOf(integer).length();
	   while (length>0){ 
		   String number = String.valueOf(integer).substring(0,length);
		   int value = Integer.parseInt(number);
		   mod = value%10;
		   sum=sum+mod;
		   length=length-1;
		 } 
	   System.out.println("The sum of " + integer + " is " + sum);
	   
}}