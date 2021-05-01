
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit = (onesDigit(12345));
		System.out.println(digit);

	}
	public static int onesDigit(int n) {
		String str = String.valueOf(n);
		int length = str.length();
		char lastDigitchar = str.charAt(length-1);
		String  lastDigitString = String.valueOf(lastDigitchar);
		int lastDigit = Integer.parseInt(lastDigitString);
		return lastDigit;
		
	}

}
