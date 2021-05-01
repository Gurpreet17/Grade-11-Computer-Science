import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		String surname;
		String name;
		int studentnumber;
		int grade;
		String school;
		System.out.println("What is your last name ?");
		surname = input.nextLine();
		System.out.println("What is your first name ?");
		name=input.nextLine();
		System.out.println("What is your student number ?");
		studentnumber = input.nextInt();
		System.out.println("What grade are you in ?");
		grade = input.nextInt();
		System.out.println("What school do you go to ?");
		school = input.next();
		System.out.println("\t\t\t" + "Student Card" + "\n" + "\t\t\t" + surname + "\t\t\t" + "\n"+ "\t\t\t" + name + "\n" + "\t\t\t" +  studentnumber + "\n" + "\t\t\t" + grade + "\n" + "\t\t\t" + school);


	}

}
