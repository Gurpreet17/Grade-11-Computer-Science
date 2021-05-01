
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mark = convertGrade(50);
		System.out.println(mark);
		

	}
	public static String convertGrade (int mark) {
		if (mark>=80 && mark<=100 && mark>=0 && mark<=100) {
			String grade = "A";
			return grade;
		}
		else if (mark>=65 && mark<=79 && mark>=0 && mark<=100) {
			String grade = "B";
			return grade;
		}
		else if (mark>=55 && mark<=64 && mark>=0 && mark<=100) {
			String grade = "C";
			return grade;
		}
		else if (mark>=50 && mark<=54 && mark>=0 && mark<=100) {
			String grade = "D";
			return grade;
		}
		else if (mark>=0 && mark<=49 && mark>=0 && mark<=100) {
			String grade = "F";
			return grade;
		}
		else {
			return "x";
		}
		
	}

}
