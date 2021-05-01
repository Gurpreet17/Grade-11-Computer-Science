
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofInt (134);

	}
	public static void SumofInt(int x) {
		String str = String.valueOf(x);
		int length = String.valueOf(x).length();
		int y = Integer.parseInt(String.valueOf(str.charAt(0)));
		int sum=0;
		for (int a=0; a<length-1; a++) {
			int z = Integer.parseInt(String.valueOf(str.charAt(a+1)));
			int temp = y;
			sum = temp+z;
			y=sum;
		}
		System.out.println(sum);
	}

}
