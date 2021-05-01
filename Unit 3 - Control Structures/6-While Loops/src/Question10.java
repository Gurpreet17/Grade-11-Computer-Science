
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double count = 100000;
		double decrease = 0.5;
		double track;
		track=0;
		while (count>=10) {
			count = count*decrease;
			track = track+1;
			System.out.println(count);
		}
		System.out.println("It took " + track + " loops for count to reach this point");

	}

}
