
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array= {1,2,3,4,5,6,-3};
		System.out.println(Median(array));

	}
	public static double Median (double [] array) {
		double median = 0;
		double [] temp = new double [array.length-1];
		for (int x=0; x<array.length; x++) {
			if (array[x]>=0) {
				temp[x] = array[x];
			}
		}
		array = temp;
		
		int length = array.length;
		if (length%2==1) {
			median = array[length/2];
		}
		else if (length%2==0) {
			median = (array[length/2] + array[(length/2)-1])/2;
		}
		return median;
	}

}
