import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		int lenght;
		int width;
		int depth;
		int volume;
		System.out.println("Enter Lenght");
		lenght = input.nextInt();
		System.out.print("Enter width:");
		width = input.nextInt();
		System.out.println("Enter depth:");
		depth = input.nextInt();
		volume = lenght*width*depth;
		System.out.println(volume + " unit cubic.");


	}

}
