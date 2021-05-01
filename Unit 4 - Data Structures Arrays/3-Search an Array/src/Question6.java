
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mark = {66,78,74,1001,40,78,88,90,33,68};
		int largest = mark[0];
		for (int x=0; x<mark.length; x++) {
			if ((mark[x]>largest) && (mark[x]<=100)){
				largest = mark[x];
			}
		}
		System.out.println(largest);


	}

}
