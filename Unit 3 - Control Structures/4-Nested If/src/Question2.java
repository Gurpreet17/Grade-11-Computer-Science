import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double mark;
		System.out.println("Enter mark:");
		mark = input.nextDouble();
		if ((mark>=84) && (mark<=100)) {
			if ((mark>=90) && (mark<=100)) {
				System.out.print("The letter grade for " + mark + " is A+");
			}
			else if((mark>=85) && (mark<=89));{
		    	System.out.print("The letter grade for " + mark + " is A");
			}
			if((mark>=80) && (mark<=84));{
		    	System.out.print("The letter grade for " + mark + " is A-");
		    }
		}

	    if ((mark>=65) && (mark<=79)) {
	    	if ((mark>=75) && (mark<=79)) {
	    		System.out.print("The letter grade for " + mark + " is B+");
	    	}
	    	else if ((mark>=70) && (mark<=74)) {
	        	System.out.print("The letter grade for " + mark + " is B");
	        }
	    	else if ((mark>=65) && (mark<=69)) {
	        	System.out.print("The letter grade for " + mark + " is B-");
	        }
	     }
	    if ((mark>=50) && (mark<=64)) {
	    	if ((mark>=60) && (mark<=64)) {
	    		System.out.print("The letter grade for " + mark + " is C+");
	    	}
	    	else if ((mark>=56) && (mark<=59)) {
	        	 System.out.print("The letter grade for " + mark + " is C");
	        }
	    
	    	else if ((mark>=50) && (mark<=55)){
	        	 System.out.print("The letter grade for " + mark + " is C-");
	        }
	    }
	    if ((mark>=0) && (mark<=49)){
	    	System.out.print("The letter grade for " + mark + " is D");
	    }

	    
	    
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
