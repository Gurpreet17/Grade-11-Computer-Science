import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int gobbled,total;
        String p;
        gobbled = 52;
        System.out.println("Enter amount of pellets to feed Pacman (no half pellets please):");
		p = input.nextLine();
		if (p.indexOf(".")==-1) {
			int pellets = Integer.parseInt(p);
			total = (gobbled + pellets);
			if (total<=100) {
				System.out.println("I’m still hungry. FEED me MORE!!");
			}
			else if((total>=101) && (total<=150)) {
		    	System.out.println("Thanks!");
		    }
			else if (total>151) {
		    	System.out.println("no more please. I’m full");
		    }
	    }
		else {
			System.out.println("Error, no half pellets please");
		}
		
		
		
		
		

	}

}
