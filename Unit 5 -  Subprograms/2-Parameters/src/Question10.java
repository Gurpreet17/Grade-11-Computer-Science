
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factor(2,8);

	}
	public static void Factor(int x, int y) {
		if (y%x==0) {
			System.out.println(x + " is a factor of " + y);
		}
		else  {
			System.out.println(x + " is not a factor of " + y);
		}
	}

}
