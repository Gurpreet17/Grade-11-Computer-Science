import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = input.nextInt();
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        System.out.println("Enter the multiplier:");
        int r = input.nextInt();
        int sum=0;
        for (int c=1; c<=n; a*=r,c=c+1)
        	sum=sum+a;
        System.out.println(sum);
        
        	
        
	}

}
