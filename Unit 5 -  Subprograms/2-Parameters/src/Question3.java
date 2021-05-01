
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax(5);

	}
	public static void Tax(double price) {
		double HST = price*0.13;
		System.out.println("The HST is " + HST);
		double finalprice = price + HST;
		System.out.println("The final price is " + finalprice);
	}

}
