import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month;
		System.out.println ("Enter integer that represents a month in the calendar:");
		month = input.nextInt();
		switch (month) {
		case 1:  System.out.print("There are 31 days in January");
				 break;
		case 2:	 System.out.print("There are 28 days in February");
		         break;
		case 3:  System.out.print("There are 31 days in March");
				 break;
		case 4:  System.out.print("There are 30 days in April");
				 break;
		case 5:  System.out.print("There are 31 days in May");
				 break;
		case 6:  System.out.print("There are 30 days in June");
				 break;
		case 7:  System.out.print("There are 31 days in July");
				 break;
		case 8:  System.out.print("There are 31 days in August");
				 break;
		case 9:  System.out.print("There are 30 days in September");
		 		 break;
		case 10: System.out.print("There are 31 days in October");
		         break;
		case 11: System.out.print("There are 30 days in November");
				 break;
		case 12: System.out.print("There are 31 days in December");
		  		 break;
        default: System.out.print("Error, the integer is not a month.");
		}
	
	}

}
