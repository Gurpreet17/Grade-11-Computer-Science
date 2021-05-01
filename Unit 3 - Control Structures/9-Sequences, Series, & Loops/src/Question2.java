import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int first,last,diff,sum,value;
		sum=0;
		value=1;
		System.out.println("Enter first value:");
		first = input.nextInt();
		System.out.println("Enter last value:");
		last = input.nextInt();
		System.out.println("Enter the common difference:");
		diff = input.nextInt();
		for(;value<=last;value+=diff) { 
			sum=sum+value;
		}
     System.out.println("The sum is " + sum);
			
		
	
	}

}
