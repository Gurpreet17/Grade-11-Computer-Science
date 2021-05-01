import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String [] songs =  new String [2000];
		System.out.println("Enter 2000 songs:");
	    for (int x=0; x<songs.length; x++) {
	    	System.out.println("Enter " + x + " song");
	    	songs [x] = input.nextLine();
	    }	
	    System.out.println ("Enter option:");
	    System.out.println("Option 1: Sort the songs alphabetically (A-Z)");
	    System.out.println("Option 2: Sort the songs alphabetically in reverse (Z-A)");
	    System.out.println("Option 3: Return to the original order");
	    int option = input.nextInt();
	    if (option==1) {
	    	
	    }
	    
	    

		

	}

}
