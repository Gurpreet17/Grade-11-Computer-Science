import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int [] mark = {60,78,74,80,74,78,88,90,74,68};
		System.out.println("Enter mark:");
		int markSearch = input.nextInt();
		int index=0;
		for (int x=0; x<mark.length; x++) {
			if (mark[x]==markSearch) {
				index=x;
			}
		}
		for (int x=index; x<mark.length-1; x++) {
			mark[x] = mark[x+1];
		}		
		for (int x=0; x<mark.length; x++) {
			System.out.println(mark[x]);
		}	
					
				
				
				
			
			
		

	}

}
