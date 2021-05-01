
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mark = {66,78,74,1001,40,78,88,90,33,68};
		int smallest = mark[0];
		for (int x=0; x<mark.length;x++) {
			if (smallest>mark[x]) {
				smallest = mark[x];
			}
		}
		System.out.println(smallest);


	}

}
