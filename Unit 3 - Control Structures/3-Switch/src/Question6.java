import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int day;
		System.out.println("Enter a day in the week to see my planned activities for that day:");
		day = input.nextInt();
		switch (day) {
		case 1: System.out.println("Monday I planned to play basketball");
		        break;
		        
		case 2: System.out.println("Tuesday I planned to play soccer");
		        break;
		
		case 3: System.out.println("Wednesday I planned to play tennis");
		        break;
		
		case 4: System.out.println("Thursday I planned to play badminton");
		        break;
		        
		        
		case 5: System.out.println("Friday I planned to play hockey");
		        break;
		        
		case 6: System.out.println("Saturday I planned to play video games");
		        break;
		        
		case 7: System.out.println ("Sunday I planned to draw");
		        break;
		        
		default: System.out.println("Error, day not existing");
		}
		
		
	   
		
		

	}

}
