
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {1,2,3,4,5,6};
		Reverse(array);

		
		
	}
	public static void Reverse (double[] array) {
		double length = array.length-1;
		double [] reverse = new double [array.length];
		for (int x=0; x<array.length; x++) {
			reverse[(int) length]= array[x];
			length--;
		}
		
		for (int x=0; x<reverse.length; x++) {
			System.out.println(reverse[x]);
		}
	}
	
	
}

