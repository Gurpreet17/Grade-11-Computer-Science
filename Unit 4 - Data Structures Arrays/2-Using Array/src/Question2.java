import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] names = new String[8];
		int student=0;
		for (;student<names.length; student++) {
			System.out.println("What is the name of student number " + student);
			names [student] = input.next();
		}
		System.out.println("The students name include:");
		for (int x=0; x<student; x++)
			System.out.println(names[x]);
		


	}

}
