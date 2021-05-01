
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {5.5, -7.5, 1.5, 3.5, 4.5};
		System.out.println(Average(array));

	}
	public static double Average (double [] array) {
		double sum=0;
		double count=0;
		double average=0;
		for (int x=0; x<array.length; x++) {
			if (array[x]>=0) {
				sum = sum + array[x];
				count++;
			}
		}
		average = sum/count;
		return average;
	}

}
