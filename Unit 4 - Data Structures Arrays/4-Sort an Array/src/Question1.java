
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int [] marks = {66,78,74,1001,40,79,88,90,33,68};
		int temp = 0;
		boolean fixed = false;
		while (fixed==false) {
		fixed=true;
		for (int x=0; x<marks.length-1; x++){
		if (marks[x]<marks[x+1]) {
		temp = marks[x];
		marks[x] = marks[x+1];
		marks[x+1]=temp;
		fixed=false;
		}
		}
		}
		for (int x=0; x<marks.length; x++) {
		System.out.println(marks[x]);
		}

		}
		*/
		
		/*
		int [] marks = {66,78,74,1001,40,79,88,90,33,68};
		int largest = marks[1];
		for (int x=0; x<marks.length; x++) {
			if (marks[x]>largest)
				largest = marks[x];
		}
		System.out.println("The largest mark is " + largest);
		int smallest =marks[1];
		for(int x=0; x<marks.length; x++) {
			if (marks[x]<smallest) {
				smallest=marks[x];
				}
		}
		System.out.println("The smallest mark is " + smallest);
		*/
		
		/*
		int [] marks = {66,78,74,1001,40,79,88,90,33,68};
		int temp = 0;
		boolean fixed = false;
		while (fixed == false) {
			fixed=true;
			for (int x=0; x<marks.length-1; x++) {
				if (marks[x]>marks[x+1]) {
					temp = marks[x];
					marks[x] = marks[x+1];
					marks[x+1] = temp;
					fixed = false;
					}
			}
		}
		for (int x=0; x<marks.length; x++) {
			System.out.println(marks[x]);
		}
		*/
		
		int [] marks = {66,78,74,1001,40,79,88,90,33,68};
		int difference=0;
		for (int x=0; x<marks.length;x=x+2) {
			difference = marks[x+1]-marks[x];
			System.out.println("The difference between " + marks[x+1] + " and " + marks[x] + " is " + difference);
			
		}


	

		
		



	}

}
