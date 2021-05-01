
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] number = {{2,5,1},
				            {3,6,4}};
		
		int [][] number1 = new int [number.length][3];
		for (int row=0; row<number.length; row++){
			for (int column=0; column<number[row].length;column++){
				number1 [row] [column] = number[row][column];
			}
		}
		for (int row=0; row<number1.length; row++) {
			for (int column=0; column<number1[row].length; column++) {
				System.out.print(" " + number1[row][column]);
			}
			System.out.println();
		}


	}

}
