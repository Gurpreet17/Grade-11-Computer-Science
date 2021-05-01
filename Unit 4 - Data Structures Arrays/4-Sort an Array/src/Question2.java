import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students taking ICS3U0:");
		int student = input.nextInt();
		int [] mark = new int [student];
		for (int x=0; x<mark.length; x++) {
			System.out.println("Enter marks of student " + (x+1) + " taking ICS3U0 out of 100 ");
			mark [x] = input.nextInt();
			while ((mark[x]<0) || (mark[x]>100)) {
				System.out.println("Invalid mark");
				System.out.println("Enter marks of student " + (x+1) + " taking ICS3U0 out of 100 ");
				mark [x] = input.nextInt();
			}
		}
		int temp=0;
		for (int x=0; x<mark.length-1; x++) {
			if (mark[x]>mark[x+1]) {
				temp = mark[1];
				mark[1] = mark[x+1];
				mark[x+1]= mark[x];
				}
		}
		int median = 0;
		if (mark.length%2==0) {
			median = ((mark.length/2) + ((mark.length/2)+1)/2);
			System.out.println("The median is " + mark[median-1]);
		}
		else if (mark.length%2==1) {
			median = ((mark.length+1)/2);
			System.out.println("The median is " + mark[median-1]);
		}
		int mode=0;
		for (int x=0; x<mark.length; x++) {
			for (int z=x+1; z<mark.length-1; z++) {
				if (mark[x]==mark[z]) {
					mode = mark[x];
				}
			}
		}
		System.out.println("The mode is " + mode);
		int largest = mark[1];
		for (int x=0; x<mark.length; x++) {
			if (mark[x]>largest){
				largest=mark[x];
			}
		}
		
		int smallest = mark[1];
		for (int x=0; x<mark.length;x++) {
			if (mark[x]<smallest){
				smallest = mark[x];
			}
		}
		int difference = largest-smallest;
		System.out.println("The greatest difference between two numbers is " + difference);
		
		
		
	
	
	
}}
