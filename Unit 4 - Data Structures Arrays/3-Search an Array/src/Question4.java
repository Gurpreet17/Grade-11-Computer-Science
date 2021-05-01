
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mark = {66,78,74,1001,40,78,88,90,33,68};
		int sum = 0;
		for (int x=0; x<mark.length; x++)
		   	sum = sum + mark[x];
		int average = sum/mark.length;
		System.out.println("The average of the marks is " + average);

		

	}

}
