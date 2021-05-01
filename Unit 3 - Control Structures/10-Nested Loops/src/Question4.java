
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		for (; x<=6;x++ ) {
			System.out.print(x+ " times table ");
			for (int y=1; y<=6; y++) {
				int operation = x*y;
				System.out.print("\t" + operation);
				
			}
		System.out.println();
		}
	}

}
