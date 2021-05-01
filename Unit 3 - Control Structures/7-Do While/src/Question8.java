import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String username,password;
	    int X;
	    X=3;
	    do {
	    	System.out.println("Enter username:");
	    	username = input.nextLine();
	    	System.out.println("Enter password:");
	    	password = input.nextLine();
	    	X=X-1;
	        if (username.equals("000000") && password.equals("password") && X!=0) {
	    		System.out.println("Access granted");
	    		break;
	    	}
	        else if (X==0) {
	    		System.out.println("You had three chances to input correct username/password");
	    		break;
	    	} 
	        else if (!username.equals("000000") && !password.equals("password") ){
	        	System.out.println("Access denied");
	        }
	    }
	    	while (!username.equals("000000") && !password.equals("password") );
	        
	    	 
	    
		
	
				
				
		    
			
			
	    }

	}


