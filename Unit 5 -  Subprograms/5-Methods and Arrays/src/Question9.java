import java.util.Scanner;
public class Question9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of student:");
		int studentNumber = input.nextInt();
		double studentMark =0;
		double [] mark = new double [studentNumber+1]; 
		for (int x=1; x<=studentNumber; x++) {
			System.out.println ("Enter mark of student " + x);
			studentMark = input.nextDouble();
			mark[x] = studentMark;
		}
		Option();
		int option = input.nextInt();
		do {
			if (option==1) {
				System.out.println("The mean average is " + MeanAverage(mark));
			}
			else if (option==2) {
				System.out.println("The lowest mark is " + LowestMark(mark));
			}
			else if (option==3) {
				System.out.println("The highest mark is " + HighestMark(mark));
			}
			else if (option==4) {
				System.out.println("The median is " + Median(mark));
			}
			else if (option==5) {
				System.out.println("The mode is " + Mode(mark));
			}
			else {
				System.out.println("Error, invalid option");
			}
		}
		while (option>5);
	}
	public static void Option () {
		System.out.println("    *OPTIONS*");
		System.out.println("1 - Mean Average");
		System.out.println("2 - Lowest Mark");
		System.out.println("3 - Highest Mark");
		System.out.println("4 - Median");
		System.out.println("5 - Mode");
		System.out.println("Enter option:");
	}
	
	public static double MeanAverage (double [] mark) {
		double sum = 0;
		double length = mark.length-1;
		for (int x=1; x<=length; x++) {
			sum=sum + mark[x];
		}
		double meanAverage = sum/length;
		return meanAverage;
	}
	
	public static double LowestMark (double [] mark) {
		double lowest = mark[1];
		for (int x=1; x<=mark.length-1; x++) {
			if (mark[x]<lowest) {
				lowest=mark[x];
			}
		}
		return lowest;
	}
	
	public static double HighestMark (double [] mark) {
		double highest = mark[1];
		for (int x=1; x<=mark.length-1; x++) {
			if (mark[x]>highest) {
				highest=mark[x];
			}
		}
		return highest;
	}
	
	public static double Median (double [] mark) {
		double median = 0;
		int length = mark.length-1;
		if (length%2==1) {
			median = mark[(length+1)/2];
		}
		else if (length%2==0) {
			median = (mark[(length)/2] + mark[(length/2)+1])/2;
		}
		return median;
	}
	
	public static double Mode (double [] mark) {
		double count = 0;
		double temp = 0;
		double mode = 0;
		for (int x=1; x<=mark.length-1; x++) {
			for (int y=x+1; y<mark.length; y++) {
				if (mark[x]==mark[y]) {
					count++;
				}
				if (temp<count) {
					mode = mark[x];
				}
				temp=count;
			}
		}
		if (count==0) {
			return -1;
		}
		return mode;
	}
	
	
	

}
