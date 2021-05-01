
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {5.5, 7.5, 1.5, 3.5, 4.5};
		System.out.print(Sum(array));

	}
	public static double Sum (double [] array) {
		double sum=0;
		for (int x=0; x<array.length; x=x+1) {
			sum = sum +array[x];
		}
		return sum;
	}

}


