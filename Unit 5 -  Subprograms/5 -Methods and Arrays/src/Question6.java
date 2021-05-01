
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = {1.0,2.0,3.0,4.0,-3.0,4.0};
		System.out.println(Mode(array));

	}
	public static double Mode (double [] array) {
		double mode=0;
		double count =0;
		double maxCount = 0;
		for (int x=0; x<array.length; x++) {
			for (int y=x+1; y<array.length; y++) {
				if (array[x] == array[y] && array[x]>=0) {
					count++;
					if (count>maxCount) {
						maxCount = count;
						mode = array[x];
						count=0;
					}
			     }
			}
       }
		if (maxCount==0) {
			return -1;
		}
		return mode;
	}
}
