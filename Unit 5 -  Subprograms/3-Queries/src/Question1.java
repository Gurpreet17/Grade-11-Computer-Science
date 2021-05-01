
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double power = norm(5,5,5);
		System.out.println(power);

	}
	public static double norm (double x, double y, double z) {
		double expression = Math.pow(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2),0.5);
		return expression;
	}

}
