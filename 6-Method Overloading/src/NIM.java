import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class NIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random random = new Random();
		int [] P = new int [5];
		for (int x=0; x<=3; x++) {
			int randomPile = 4+random.nextInt(5);
			P[x] = randomPile;
		}
		Display(P);
		Player1turn(P);
		
		
		
		

			
		
		
		
		
		
		
		
	}
	
	public static String Setup () {
		int [] pile = new int [4];
		Random random = new Random();
		for (int x=0; x<=3; x++) {
			int randomPile = 4+random.nextInt(5);
			pile[x] = randomPile;
		}
		return Arrays.toString(pile);
	}
	
	public static void Display (int [] P) {
		System.out.print("Pile 1 =" + P[0]);
		System.out.print ("\t Pile 2 = " + P[1]);
		System.out.print ("\t Pile 3 = " + P[2]);
		System.out.print ("\t Pile 4 = " + P[3]);		
	}
	public static void Player1turn(int []P) {
		Scanner input = new Scanner (System.in);
		System.out.println();
		System.out.println("Player 1: enter pile:");
		int pile1 = input.nextInt();
		int removal1=0;
		if(pile1>0 && pile1<P.length) {
			System.out.println("Player 1: enter sticks");
			int stick1 = input.nextInt();
			if (stick1>0 && stick1<P[pile1]) {
				removal1 = P[pile1]-stick1;
				
			}
		}
	}
	
	public static void Player2turn(int []P) {
		Scanner input = new Scanner (System.in);
		System.out.println("Player 2: enter pile:");
		int pile2 = input.nextInt();
		int removal2=0;
		if(pile2>0 && pile2<P.length) {
			System.out.println("Player 2: enter sticks");
			int stick2 = input.nextInt();
			if (stick2>0 && stick2<P[pile2]) {
				removal2 = P[pile2]-stick2;
			}
		}
	}
	
	public static boolean Check(int P) {
		boolean check = false;
		if (P>0) {
			check = true;
		}
		else if (P<=0) {
			check = false;
		}
		return check;
	}
	
	public static int RemoveNumber(int P, int S) {
		int remaining=0;
		if (P<S) {
			remaining = -1;
		}
		else {
		remaining= P-S;
		}
		return remaining;
	}
	
	public static boolean DetermineLoser(int [] P) {
		boolean looser = false;
		int count=0;
		for (int x=0; x<=3; x++){
			if (P[x] ==0) {
				count++;
			}
		}
		if (count==3) {
			looser=true;
		}
		else {
			looser = false;
		}
		return looser;
	}
	
	
	
	
	
}


