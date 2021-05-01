import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = input.nextInt();
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        System.out.println("Enter the multiplier:");
        int r = input.nextInt();
        int Sn = (int) (a*(Math.pow(r,n)-1))/(r-1);
        System.out.println("The sum is " + Sn);
        		
	}

}
