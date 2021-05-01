
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exponent(5,5);

	}
	public static void Exponent(int x, int y) {
		int exponent=x;
		for (int a=1; a<y; a++) {
			int value =exponent;
			exponent = x*value;
		}
		System.out.println(exponent);
	}

}
