
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean square;
		square = (isSquare (25));
		System.out.println(square);

	}
	public static boolean isSquare (int n) {
		String str = String.valueOf(n);
		int length = str.length()-1;
		if (str.charAt(length) == '0' || str.charAt(length) == '1' || str.charAt(length) == '4' || str.charAt(length) == '5' || str.charAt(length) == '6' || str.charAt(length) == '9') {
			return true;
			
		}
		else {
			return false;
		}
	
	}

}
