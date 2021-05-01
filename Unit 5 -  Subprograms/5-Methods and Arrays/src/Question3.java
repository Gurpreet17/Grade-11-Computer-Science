
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println(Smallest(array));
		

	}
	public static double Smallest (double [] array) {
		double smallest=array[1];
		for (int x=0; x<array.length-1; x++) {
			if (smallest>array[x]) {
				smallest = array[x];
			}
		}
		return smallest;
	}

}
