
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price,track;
		price = 427000;
		track=0;
		while (price>376000) {
			price = price - (price*0.05);
			track = track + 1;
		}
		System.out.println("It took " + track + " to sell the house");

	}

}
