import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is the width?");
		int width = input.nextInt();
		System.out.println("What is the length?");
        int length = input.nextInt();
        for(int trackw=1; trackw<=width; trackw++) {
        	  for (int trackl=1; trackl<=length; trackl++) {
              	System.out.print("*");
        	  }
        	  System.out.println();
        }
        
 
        

		

	}}


