import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		int height;
		int width;
		int area;
		System.out.println("Enter the height of the rectangle");
		height = input.nextInt();
		System.out.println("Enter the width of the rectangle");
		width = input.nextInt();
		area = (height*width); 
		System.out.print("The area of the rectangle is " + area);


	}

}
