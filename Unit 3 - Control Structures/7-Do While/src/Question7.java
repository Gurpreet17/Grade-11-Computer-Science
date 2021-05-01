import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double price,total;
		total=0;
		do {
			System.out.println("Enter price:");
			price = input.nextInt();
			total=total+price;
			if (price<0) {
				System.out.println("Total: $" + (total-price));
			}
		}
	    while (price>=0);	
	    
	
	
	
	
	
	}
	
	
	   
		
		
		}

	


