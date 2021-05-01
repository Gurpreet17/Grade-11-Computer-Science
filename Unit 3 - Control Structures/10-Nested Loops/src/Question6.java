import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is the base?");
		int base = input.nextInt();
		System.out.println("What is the length?");
        int length = input.nextInt();
        for (int trackl=1; trackl<=length; trackl++) {
        	for (int trackb=1; trackb<=trackl; trackb++) {
        		System.out.print("*");
        	} 
        System.out.println();
        }
 
	
	
	
	}


}


