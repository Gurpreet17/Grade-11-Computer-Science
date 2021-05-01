
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area=1.0;
		double thickness=0.090;
		for (double term=1.0; term<49; term++) {
			area/=2;
			thickness+=0.090;			
		}
        System.out.println("The area of each piece is " + area + "m2");
        System.out.println("The thickness of pile is " + Math.round(thickness*100)/100.0 + "mm");
	}

}
