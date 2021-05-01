
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		int [][] values = {{11, -2, 4, 0},
						   {-4, 16,  3, 1},
				           {7, 2, 12, 6}};
		int smallest=0;
		for (int row=0; row<values.length-1; row++) {
			for (int column=0; column<values[row].length-1; column++) {
				if (values[row][column]<smallest) {
					smallest = values[row][column];
				}
			}
		}
		System.out.println(smallest);
		*/
		
		/*
		int [][] values = {{11, -2, 4, 0},
						   {-4, 16,  3, 1},
		                   {7, 2, 12, 6}};
		int largest = 0;
		for (int row=0; row<values.length; row++) {
			for (int column=0; column<values[row].length; column++) {
				if (values[row][column]>largest) {
					largest = values[row][column];
				}
			}
		}
		System.out.println(largest);
		*/
		
		/*
		int [][] values = {{11, -2, 4, 0},
				           {-4, 16,  3, 1},
		                   {7, 2, 12, 6}};
		int sum=0;
		for (int row=0; row<values.length; row++) {
			for (int column=0; column<values[row].length; column++) {
				sum = sum + values[row][column];
			}
		}
		System.out.println("The sum is " + sum);
		*/
	
		/*
		int [][] values = {{11, -2, 4, 0},
				          {-4, 16,  3, 1},
		                  {7, 2, 12, 6}};
		int sum=0;
		for (int row=0; row<values.length; row++) {
			for (int column=0; column<values[row].length; column++) {
				sum = sum+values[row][column];
			}
			System.out.println("The sum of array " + row + " is " + sum);
			sum=0;
		}
		*/
		
		/*
		int [][] values = {{11, -2, 4, 0},
		          		   {-4, 16,  3, 1},
                           {7, 2, 12, 6}};
		int sum=0;
		for (int column=0; column<values[0].length; column++) {
			for (int row=0; row<values.length; row++) {
				sum = sum+values[row][column];
			}
			System.out.println("The sum on column" + column + " is " + sum);
			sum=0;
		}
		*/
		int [][] values = {{11, -2, 4, 0},
       		   {-4, 16,  3, 1},
                {7, 2, 12, 6}};
		for (int row=0; row<values.length; row++) {
			for (int column=0; column<values[row].length; column++) {
				System.out.print(" " + values[row][column]);
			}
			System.out.println();
		
		}
		
		
		
		
	
		
			
		
	


	}

}
