
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int celcius=0,fahrenheit=32; celcius<=100; celcius+=10,fahrenheit=(celcius*(9/5)+32))
			System.out.println(celcius +"°C ------->" + fahrenheit + "°F");

	}

}
