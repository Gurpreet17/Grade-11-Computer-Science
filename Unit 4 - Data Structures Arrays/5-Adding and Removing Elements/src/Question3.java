
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mark = {60,78,74,80,74,78,88,90,74,68};
		boolean fixed = false; 
		while(fixed==false) {
			fixed=true;
			for (int x=0; x<mark.length-1; x++) {
				if (mark[x]>mark[x+1]) {
					int temp = mark[x];
					mark[x]=mark[x+1];
					mark[x+1]=temp;
					fixed=false;
				}
			}
		}
	
		int c=0;
		for (int x=0; x<mark.length; x++) {
			if (mark[x]==80) {
				c=x;
			}
		}
		for (int x=c; x<mark.length-1; x++){
			mark[x] = mark[x+1];
		}
		for (int x=0; x<mark.length; x++) {
			System.out.println(mark[x]);
		}
	
		
			
		

	}

}
