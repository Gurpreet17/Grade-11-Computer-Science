
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int animals,food,hour;
		animals = 10;
		food = 1000;
		hour=1;
		while (animals<food) {
			animals = animals*2;
			food = food+4000;
			hour=hour+1;
			System.out.println("There are " + animals + " animals and enough food for " + food + " animals"); 
		}
		System.out.println("The population will outgrow the food supplies in " + hour + " hours");

	}

}
