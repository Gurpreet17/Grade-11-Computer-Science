import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int mark;
		System.out.println("Enter mark received in the last test:");
		mark = input.nextInt();
		switch (mark) {
		case 0:
		case 1: 
		case 2:
		case 3:
		case 4:    System.out.println("Mark: " + mark);
                   System.out.println("Grade: F");
                   System.out.println("Remark: unsatisfactory");
                   break;
		
	    case 5:    System.out.println("Mark: " + mark);
		           System.out.println("Grade: D");
		           System.out.println("Remark: Needs Improvement");
		           break;
		           
		case 6:    System.out.println("Mark: " + mark);
				   System.out.println("Grade: C");
				   System.out.println("Remark: Satisfactory");
				   break;
				   
		case 7:    System.out.println("Mark: " + mark);
		           System.out.println("Grade: B");
		           System.out.println("Remark: Good");
		           break;
		 
		case 8:
		case 9:
		case 10:  System.out.println("Mark: " + mark);
                  System.out.println("Grade: A");
                  System.out.println("Remark: Excellent");
                  break;
		
		default:   System.out.print("Mark is invalid");   
		}
		

		
	}

}
