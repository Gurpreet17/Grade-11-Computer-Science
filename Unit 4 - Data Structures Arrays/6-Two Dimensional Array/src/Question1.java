
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int [][] value = {{1,0,0},
						  {0,1,0},
						  {0,0,1}};
		for (int row=0; row<value.length; row++) {
			for (int column=0; column<value[row].length; column++) {
				if (value[row][column]==1) {
					System.out.println("Index location of the value 1 is on " + column + " on the array " + row);
				}
			}
		}
		
		

		
		
		
		
	

	}

}
