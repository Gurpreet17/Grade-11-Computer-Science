import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		/*
		String w;
		w = "abcdefghijklmnopqrstuvwxyz";
		int n;
		System.out.println("Enter an integer:");
		n = input.nextInt();
		System.out.println("The " + n + "th number is " + w.charAt(n-1));
		*/
		/*
		String w;
		w = "abcdefghijklmnopqrstuvwxyz";
		int x;
		int y;
		System.out.println("Enter an integer:");
		x = input.nextInt();
		System.out.println("enter another integer");
		y = input.nextInt();
		System.out.println("The letters in the range of " + "" + x + " and " + y + " are " + w.substring(x-1,y));
        */
		String w;
		w = "abcdefghijklmnopqrstuvwxyz";
		int x;
		int y;
		System.out.println("Enter an integer:");
		x = input.nextInt();
		System.out.println("enter another integer");
		y = input.nextInt();
		System.out.println("The letters in the range of " + "" + x + " and " + y + " are " + w.substring(x,y-1));



	}

}
