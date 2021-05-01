
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position1 = digit (123,0);
		System.out.println(position1);

	}
	public static int digit (int digit, int n) {
		String str = String.valueOf(digit);
		String str1 = String.valueOf(str.charAt(n));
		int position = Integer.parseInt(str1);
		return position;
	}

}
