
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int[] number = {10, -2, 4, 3, -5,  3,  7, 1, 11,  12, 15, 0};
		for (int x=0; x<number.length; x++)
			System.out.println(number[x]);
		*/
		
		
		double[] number = {10, -2, 4, 3, -5,  3,  7, 1, 11,  12, 15, 0};
		double sum=0;
		int track=0;
		while (track<number.length) {
			sum=sum+number[track];
			track++;
		}
		double average = sum/track;
		System.out.println("The sum is " + sum );
		System.out.println("The average is " + average);

		
		
		


	}

}
