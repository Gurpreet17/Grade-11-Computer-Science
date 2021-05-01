
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println(Largest(array));

	}
	public static double Largest (double [] array) {
		double largest=0;
		for (int x=0; x<array.length; x++) {
			if (largest<array[x]) {
				largest = array[x];
			}
	    }
		return largest;
	}

}
