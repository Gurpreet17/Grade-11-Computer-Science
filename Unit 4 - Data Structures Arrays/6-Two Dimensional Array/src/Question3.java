import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter row:");
		int row = input.nextInt();
		System.out.println("Enter column:");
		int column = input.nextInt();
		String [][] stars = new String [row][column];
		for (int row1=0; row1<stars.length; row1++) {
			for (int column1=0; column1<stars[row1].length; column1++) {
				stars[row1][column1]= "*";
			}
		}
		for (int row1=0; row1<stars.length; row1++) {
			for (int column1=0; column1<stars[row1].length; column1++) {
				System.out.print(stars[row1][column1]);
			}
			System.out.println();
		}


	}

}
