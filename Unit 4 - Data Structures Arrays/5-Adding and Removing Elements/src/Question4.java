import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int [] mark = {60,78,74,80,74,78,88,90,74,68};
		System.out.println("Enter mark:");
		int markAdd = input.nextInt();
		int [] temp = new int [mark.length+1];
		for (int x=0; x<mark.length; x++) {
			temp[x] = mark[x];
		}
		temp[temp.length-1] = markAdd;
		mark = temp;
		boolean fixed = false;
		while (fixed==false) {
			fixed = true;
			for (int x=0; x<mark.length-1; x++) {
				if (mark[x]>mark[x+1]) {
					int memory = mark[x];
					mark[x] = mark[x+1];
					mark[x+1] = memory;
					fixed = false;
				}
			}
		}
		for (int x=0; x<mark.length; x++) {
			System.out.println(mark[x]);
		}
		
	
		
		

	}

}
