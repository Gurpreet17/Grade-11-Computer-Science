
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mark = {60,78,74,80,74,78,88,90,74,68};
		int [] temp = new int [mark.length+1];
		for (int x=0; x<mark.length; x++) {
			temp[x] = mark[x];
		}
		temp [temp.length-1] = 74;
		mark = temp;
		boolean fixed = false;
		while (fixed==false) {
			fixed = true;
			for (int x=0; x<mark.length-1; x++) {
				if (mark[x]>mark[x+1]) {
					int store = mark[x];
					mark[x] = mark[x+1];
					mark[x+1] = store;
					fixed = false;
			    }
			}
		}
		for (int x=0; x<mark.length; x++) {
			System.out.println(mark[x]);
		}
		

	}

}
