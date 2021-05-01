import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int selection;
		do {
			Menu();
			System.out.println ("Enter selection:");
			selection = input.nextInt();
			if (selection==1) {
				PersonalInfo();
			}
			if (selection==2) {
				SchoolInfo();
			}
			if (selection==3) {
				Transcript();
			}
			if (selection==4) {
				Notes();
			}
			if (selection==5) {
				System.out.println("Exiting");
			}
			else {
				System.out.println("Error, try again");
			}
		}
		while (selection!=5);
		
	}
	
	public static void Menu(){
		System.out.println("1.  Personal Information");
		System.out.println("2.	School Information");
		System.out.println("3.	Transcript");
		System.out.println("4.	Notes");
		System.out.println("5.	Exit");
	}
	
	public static void PersonalInfo() {
		System.out.println("Gurpreet Singh");
		System.out.println ("17");
		System.out.println("5 Beachsurf Rd");
		System.out.println("Brampton, ON, L6R 2M2");
	}
	
	public static void SchoolInfo() {
		System.out.println("Harold M. Brathwiate SS");
		System.out.println("23 Great Lakes BLVD");
	}
	
	public static void Transcript() {
		System.out.println("Computer Engineering");
		System.out.println("90%");
		System.out.println("Accounting");
		System.out.println("80%");
		System.out.println("Chemistry");
		System.out.println("92%)");
		System.out.println("Computer Science");
		System.out.println("90%");
	}
	
	public static void Notes() {
		System.out.println("Go for a run and do abs workouts before eating dinner");
	}
	

}
