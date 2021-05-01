
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mark =  {66,78,74,1001,40,78,88,90,33,68};
		int temp=0;
		boolean fixed = false;
		while (fixed==false) {
			fixed =true;
			for (int x=0; x<mark.length-1; x++) {
				if (mark[x]>mark[x+1]) {
		   			temp = mark[x];
		   			mark[x]=mark[x+1];
		   			mark[x+1]=temp;
		   			fixed=false;
		   			}
			}
		}
		for (int x=0; x<mark.length; x++) {
			System.out.println(mark[x]);
		}
		
		int median = (mark.length/2-1);
		System.out.println("The median is " + mark[median]);

	}

}
