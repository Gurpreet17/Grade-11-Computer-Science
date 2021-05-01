import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int width, length,option,perimeter,area;
		boolean check;
		System.out.println("Enter length:");
		length = input.nextInt();
		System.out.println("Enter width:");
		width = input.nextInt();
		System.out.println("User input \t Output Calculations \n 1 \t\t Dimensions of rectangle \n 2 \t\t Perimeter of rectangle \n 3 \t\t Area of rectangle \n 4 \t\t Check if rectangle is a square");
        System.out.println("Enter option from table above");
        option = input.nextInt();
        switch (option) {
        case 1: System.out.println("Dimensions of the rectangle are " + length + " in length and " + width + " in width.");
                break;     
                
        case 2: perimeter = (length+length+width+width);
        	    System.out.println("The perimeter of the rectangle is " + perimeter);
        	    break;  
        	    
        case 3: area = (length*width);
                System.out.println("The area of the rectangle is " + area);
                break;  
                
        case 4: if (length==width) {
        	        System.out.println("The rectangle is a square");
        	        }
                else {
                	System.out.println("The rectangle is not a square");
        	       }
                break;
       
        default: System.out.println("Error, option not valid");
        }
	}}
