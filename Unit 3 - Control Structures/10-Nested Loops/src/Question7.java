
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Canada";
		int length = input.length();
		for (int row=1; row<=length; row++) {
			for (int column=0; column<row; column++) {
				System.out.print(input.charAt(column));
		    }
		System.out.println();
	    }

}}
