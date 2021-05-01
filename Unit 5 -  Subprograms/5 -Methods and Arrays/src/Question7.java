
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array= {1,3,3,4,5,6};
		System.out.println(Median(array));

	}
	public static double Median (double [] array) {
		double length = array.length-1;
		double median = ((length)/2)+1;
		if (length%2==1) {
			int median1 = (int) median;
			median = array[median1];
		}
		else if (length%2==0) {
			double min = Math.floor(median);
			double max = Math.ceil(median);
			int min1 = (int) min;
			int max1 = (int) max;
			median = ((array[max1]+array[min1])/2);
			return min;
		}
		return median;
	
		
	}

}
