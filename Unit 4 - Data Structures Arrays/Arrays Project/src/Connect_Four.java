import java.util.Random;
import java.util.Scanner; //import Scanner
public class Connect_Four{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //declare scanner
        Random rand = new Random(); //declare random
        //VARIABLES 
		int choiceCheck = 0; //for invalid option chosen
		boolean win = false; //for win or loose
		boolean inputCheck = true; //for invalid column chosen
		
	    //INSTRUCTIONS
		System.out.println("***************************************************************");
	    System.out.println("\t\t\t CONNECT FOUR!");
		System.out.println("***************************************************************");
        System.out.println("\t\t\t HOW TO PLAY:\n");
        System.out.println("⦿ Decide who will start first by entering the names in order \n");
        System.out.println("⦿ Players will then alternate turns after playing a checker. \n");
        System.out.println("⦿ On your turn, drop one of the checker down on any column on the grid. \n");
        System.out.println("⦿ Plays alternate until one of the players gets FOUR of the tokens in a row \n");
        System.out.println("⦿The four checkers can be horizontal, vertical, or diagonal \n");

		
		//GAME OPTIONS 
		do{
			
			//PROMT user for opponent options
			System.out.println("\t\t\t Play against:");
			System.out.println("\t\t\t ************");
			System.out.println("\t\t\t A - Computer");
			System.out.println("\t\t\t B - Player");
			System.out.println("***************************************************************");

			String game = input.next();
			
			if (game.equals("a") || game.equals("A")) {//if option A (computer) selected
				//OUTPUT SELECTION
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("\t\t    Computer selected.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				//PROMT for winner names
				System.out.println("Enter the name of player 1:"); 
				String player1 = input.next(); // player 1 name
				String player2 = "Computer"; //player 2 name
				
				//DEECLARE ARRAY
				int column = 7; int row = 6;
				String[][] grid = new String [row][column];
				
				//FOR WINNER
				String winner = " "; //for winner
				
				//SETTNG ALL ARRAY VALUES 
				for (int a = 0; a < row ; a++) {
					for (int b = 0; b < column ; b++) {
						grid[a][b] = "○";}}
				
				//GAME
				do {					
					inputCheck = true;
					if (win ==false) {
						//OUTPUT grid with number columns.
						System.out.println("   COLUMN"); //output title
						System.out.println("~~~~~~~~~~~~~"); //divider 
						System.out.println("1 2 3 4 5 6 7"); //output column number
						System.out.println("~~~~~~~~~~~~~"); //divider 
						for (int a = 0 ; a < row ; a++) {
							for(int b = 0 ; b < column ; b++) {
								System.out.print(grid[a][b]+" ");}
							System.out.println();}
						System.out.println("~~~~~~~~~~~~~"); //divider 
									
						while(inputCheck == true) {
							inputCheck = false;
							//PROMT player1 FOR inputCheck CHOICE
							System.out.println(player1+", enter column you like to enter your token:"); //prompts user to enter column for token
							int temp1 = (input.nextInt())-1; //store player 1 input in temp variable
							
							//'check' for token below (gravity pulling tokens down)
							if (temp1 < 0 || temp1 > 6) { //if temp input is out of range
								System.out.print("Error. Invalid input. "); //output error
								inputCheck = true;} //repeat inputCheck
							else {
								for (int a = (row-1) ; a >= 0 ; a--) { //searches what empty row for token
									if (grid[a][temp1] == "○") {
										grid[a][temp1] = "•";
										a = 0; //declare a to value above condition to exit loop						
										inputCheck = false;} //do not repeat inputCheck
									else if(a == 0 && (grid[a][temp1].equals("♦") || grid[a][temp1].equals("•"))) { //check if column is filled
										System.out.print("Error. Column is filled. "); inputCheck = true;}}}}}
					//CHECK FOR WINNER
					//TIE CHECK
					int tieCheck = 0;
					for (int a = 0; a < column; a++) {
						if(!grid[0][a].equals("○")){
							tieCheck =tieCheck + 1;}}
					if(tieCheck==7) {
						System.out.println("It is a tie. Game over.");}
					//HORIZONTAL
					for (int a = 0; a < row && a < 7; a++) {
						for (int b = 0; b < column && b < 7; b++) {
							if ( b != 7 && grid[a][b].equals("•")) {//check if first player has row
								if ( b+1 != 7 && grid[a][b+1].equals("•")) {
									if ( (b+2) != 7 && grid[a][b+2].equals("•")) {
										if ( (b+3) != 7 && grid[a][b+3].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if (b != 7 && grid[a][b].equals("♦")) {//check if second player has row
									if ((b+1) != 7 && grid[a][b+1].equals("♦")) {
										if ((b+2) != 7 && grid[a][b+2].equals("♦")) {
											if ((b+3) != 7 && grid[a][b+3].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}//if not go back and search the rest
					//VERTICAL
					for (int a = 0; a < row; a++) {
						for (int b = 0; b < column; b++) {
							if ( a != 0 && grid[a][b].equals("•")) {//check if first player has row
								if ( (a-1) != 0 && grid[a-1][b].equals("•")) {
									if ( (a-2) != 0 && grid[a-2][b].equals("•")) {
										if ( (a-3) != 0 && grid[a-3][b].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if ( a != 0 && grid[a][b].equals("♦")) {//check if second player has row
									if ( (a-1) != 0 && grid[a-1][b].equals("♦")) {
										if ( (a-2) != 0 && grid[a-2][b].equals("♦")) {
											if ( (a-3) != 0 && grid[a-3][b].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}
					//DIAGONAL CHECK
					//P1
					int count = 0; int bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if ( grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") {
											count += 1;}
										else if (grid[a][b] != "♦") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P1
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if  (grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") { //check if matches
											count += 1;}
										else if (grid[a][b] != "♦") {
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}//end check
					
					if (win == false) {	
						//OUTPUT grid with number columns.
						System.out.println("   COLUMN"); //output title
						System.out.println("~~~~~~~~~~~~~"); //divider 
						System.out.println("1 2 3 4 5 6 7"); //output column number
						System.out.println("~~~~~~~~~~~~~"); //divider 
						for (int a = 0 ; a < row ; a++) {
							for(int b = 0 ; b < column ; b++) {
								System.out.print(grid[a][b]+" ");}
							System.out.println();}
						System.out.println("~~~~~~~~~~~~~"); //divider 
						
						//PLAYER 2 inputCheck
						inputCheck = true;
						while(inputCheck == true) {
							//PROMT player1 FOR inputCheck CHOICE
							int temp2 = (rand.nextInt(7));
							
							//'check' for token below (gravity pulling tokens down)
							if (temp2 < 0 || temp2 > 6) { //if temp input is out of range
								System.out.print("Error. Invalid input. "); //output error
								inputCheck = true;} //restart for loop
							else {
								for (int a = (row-1) ; a >= 0 ; a--) { //navigate what empty row for token
									if (grid[a][temp2] == "○") {
										System.out.println(player2+" has chosen "+temp2+".");
										grid[a][temp2] = "♦";
										a = 0; //declares a to value above condition to exit loop					
										inputCheck = false;} //do not repeat inputCheck
									else if(a == 0 && (grid[a][temp2].equals("♦") || grid[a][temp2].equals("•"))) { //check if column is filled
										System.out.print("Error. Column is filled. ");}}}}}
					
					//CHECK FOR WINNER
					//TIE CHECK
					tieCheck = 0;
					for (int a = 0; a < column; a++) {
						if(!grid[0][a].equals("○")){
							tieCheck =tieCheck + 1;}}
					if(tieCheck==7) {
						System.out.println("It is a tie. Game over.");}
					//HORIZONTAL
					for (int a = 0; a < row && a < 7; a++) {
						for (int b = 0; b < column && b < 7; b++) {
							if ( b != 7 && grid[a][b].equals("•")) {//check if first player has row
								if ( b+1 != 7 && grid[a][b+1].equals("•")) {
									if ( (b+2) != 7 && grid[a][b+2].equals("•")) {
										if ( (b+3) != 7 && grid[a][b+3].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if (b != 7 && grid[a][b].equals("♦")) {//check if second player has row
									if ((b+1) != 7 && grid[a][b+1].equals("♦")) {
										if ((b+2) != 7 && grid[a][b+2].equals("♦")) {
											if ((b+3) != 7 && grid[a][b+3].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}//if not go back and search the rest
					//VERTICAL
					for (int a = 0; a < row; a++) {
						for (int b = 0; b < column; b++) {
							if ( a != 0 && grid[a][b].equals("•")) {//check if first player has row
								if ( (a-1) != 0 && grid[a-1][b].equals("•")) {
									if ( (a-2) != 0 && grid[a-2][b].equals("•")) {
										if ( (a-3) != 0 && grid[a-3][b].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if ( a != 0 && grid[a][b].equals("♦")) {//check if second player has row
									if ( (a-1) != 0 && grid[a-1][b].equals("♦")) {
										if ( (a-2) != 0 && grid[a-2][b].equals("♦")) {
											if ( (a-3) != 0 && grid[a-3][b].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}
					//DIAGONAL CHECK
					//P1
					count = 0; bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if ( grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") {
											count += 1;}
										else if (grid[a][b] != "♦") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P1
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if  (grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") { //check if matches
											count += 1;}
										else if (grid[a][b] != "♦") {
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}//end check

				}while(win == false);
				//OUTPUT grid with number columns.
				System.out.println("   COLUMN"); //output title
				System.out.println("~~~~~~~~~~~~~"); //divider 
				System.out.println("1 2 3 4 5 6 7"); //output column number
				System.out.println("~~~~~~~~~~~~~"); //divider 
				for (int a = 0 ; a < row ; a++) {
					for(int b = 0 ; b < column ; b++) {
						System.out.print(grid[a][b]+" ");}
					System.out.println();}
				System.out.println("~~~~~~~~~~~~~\n"); //divider 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //divider 
				System.out.println("\t\t "+ winner+" WINS!"); 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //divider 
			}
			
			else if (game.equals("b") || game.equals("B")) { //if option vs winner selected
				//OUTPUT SELECTION
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("\t\t      Player selected.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				//PROMT for winner names
				System.out.println("Enter the name of player 1:"); 
				String player1 = input.next(); // player 1 name
				System.out.println("Enter the name of player 2:");
				String player2 = input.next(); //player 2 name
				
				//DEECLARE ARRAY
				int column = 7; int row = 6;
				String[][] grid = new String [row][column];
				
				//FOR WINNER
				String winner = " "; //for winner
				
				//SETTNG ALL ARRAY VALUES 
				for (int a = 0; a < row ; a++) {
					for (int b = 0; b < column ; b++) {
						grid[a][b] = "○";}}
				
				//GAME
				do {					
					inputCheck = true;
					if (win ==false) {
						//OUTPUT grid with number columns.
						System.out.println("   COLUMN"); //output title
						System.out.println("~~~~~~~~~~~~~"); //divider 
						System.out.println("1 2 3 4 5 6 7"); //output column number
						System.out.println("~~~~~~~~~~~~~"); //divider 
						for (int a = 0 ; a < row ; a++) {
							for(int b = 0 ; b < column ; b++) {
								System.out.print(grid[a][b]+" ");}
							System.out.println();}
						System.out.println("~~~~~~~~~~~~~"); //divider 
									
						while(inputCheck == true) {
							inputCheck = false;
							//PROMT player1 FOR inputCheck CHOICE
							System.out.println(player1+", enter column you like to enter your token:"); //promt user to enter column for token
							int temp1 = (input.nextInt())-1; //store player one input in temp variable
							
							//'check' for token below (gravity pulling tokens down)
							if (temp1 < 0 || temp1 > 6) { //if temp input is out of range
								System.out.print("Error. Invalid input. "); //output error
								inputCheck = true;} //repeat inputCheck
							else {
								for (int a = (row-1) ; a >= 0 ; a--) { //navigate what empty row for token
									if (grid[a][temp1] == "○") {
										grid[a][temp1] = "•";
										a = 0; //declare a to value above condition to exit loop						
										inputCheck = false;} //do not repeat inputCheck
									else if(a == 0 && (grid[a][temp1].equals("♦") || grid[a][temp1].equals("•"))) { //check if column is filled
										System.out.print("Error. Column is filled. "); inputCheck = true;}}}}}
					//CHECK FOR WINNER
					//TIE CHECK
					int tieCheck = 0;
					for (int a = 0; a < column; a++) {
						if(!grid[0][a].equals("○")){
							tieCheck =tieCheck + 1;}}
					if(tieCheck==7) {
						System.out.println("It is a tie. Game over.");}
					//HORIZONTAL
					for (int a = 0; a < row && a < 7; a++) {
						for (int b = 0; b < column && b < 7; b++) {
							if ( b != 7 && grid[a][b].equals("•")) {//check if first player has row
								if ( b+1 != 7 && grid[a][b+1].equals("•")) {
									if ( (b+2) != 7 && grid[a][b+2].equals("•")) {
										if ( (b+3) != 7 && grid[a][b+3].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if (b != 7 && grid[a][b].equals("♦")) {//check if second player has row
									if ((b+1) != 7 && grid[a][b+1].equals("♦")) {
										if ((b+2) != 7 && grid[a][b+2].equals("♦")) {
											if ((b+3) != 7 && grid[a][b+3].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}//if not go back and search the rest
					//VERTICAL
					for (int a = 0; a < row; a++) {
						for (int b = 0; b < column; b++) {
							if ( a != 0 && grid[a][b].equals("•")) {//check if first player has row
								if ( (a-1) != 0 && grid[a-1][b].equals("•")) {
									if ( (a-2) != 0 && grid[a-2][b].equals("•")) {
										if ( (a-3) != 0 && grid[a-3][b].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if ( a != 0 && grid[a][b].equals("♦")) {//check if second player has row
									if ( (a-1) != 0 && grid[a-1][b].equals("♦")) {
										if ( (a-2) != 0 && grid[a-2][b].equals("♦")) {
											if ( (a-3) != 0 && grid[a-3][b].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}
					//DIAGONAL CHECK
					//P1
					int count = 0; int bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if ( grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") {
											count += 1;}
										else if (grid[a][b] != "♦") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P1
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if  (grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") { //check if matches
											count += 1;}
										else if (grid[a][b] != "♦") {
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}//end check
					
					if (win == false) {	
						//OUTPUT grid with number columns.
						System.out.println("   COLUMN"); //output title
						System.out.println("~~~~~~~~~~~~~"); //divider 
						System.out.println("1 2 3 4 5 6 7"); //output column number
						System.out.println("~~~~~~~~~~~~~"); //divider 
						for (int a = 0 ; a < row ; a++) {
							for(int b = 0 ; b < column ; b++) {
								System.out.print(grid[a][b]+" ");}
							System.out.println();}
						System.out.println("~~~~~~~~~~~~~"); //divider 
						
						//PLAYER 2 inputCheck
						inputCheck = true;
						while(inputCheck == true) {
							//PROMT player1 FOR inputCheck CHOICE
							System.out.println(player2 +", enter column you like to enter your token:"); //promt user to enter column for token
							int temp2 = (input.nextInt())-1; //store player one input in temp variable
							
							//'check' for token below (gravity pulling tokens down)
							if (temp2 < 0 || temp2 > 6) { //if temp input is out of range
								System.out.print("Error. Invalid input. "); //output error
								inputCheck = true;} //restart for loop
							else {
								for (int a = (row-1) ; a >= 0 ; a--) { //navigate what empty row for token
									if (grid[a][temp2] == "○") {
										grid[a][temp2] = "♦";
										a = 0; //declares a to value above condition to exit loop					
										inputCheck = false;} //do not repeat inputCheck
									else if(a == 0 && (grid[a][temp2].equals("♦") || grid[a][temp2].equals("•"))) { //check if column is filled
										System.out.print("Error. Column is filled. ");}}}}}
					
					//CHECK FOR WINNER
					//TIE CHECK
					tieCheck = 0;
					for (int a = 0; a < column; a++) {
						if(!grid[0][a].equals("○")){
							tieCheck =tieCheck + 1;}}
					if(tieCheck==7) {
						System.out.println("It is a tie. Game over.");}
					//HORIZONTAL
					for (int a = 0; a < row && a < 7; a++) {
						for (int b = 0; b < column && b < 7; b++) {
							if ( b != 7 && grid[a][b].equals("•")) {//check if first player has row
								if ( b+1 != 7 && grid[a][b+1].equals("•")) {
									if ( (b+2) != 7 && grid[a][b+2].equals("•")) {
										if ( (b+3) != 7 && grid[a][b+3].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if (b != 7 && grid[a][b].equals("♦")) {//check if second player has row
									if ((b+1) != 7 && grid[a][b+1].equals("♦")) {
										if ((b+2) != 7 && grid[a][b+2].equals("♦")) {
											if ((b+3) != 7 && grid[a][b+3].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}//if not go back and search the rest
					//VERTICAL
					for (int a = 0; a < row; a++) {
						for (int b = 0; b < column; b++) {
							if ( a != 0 && grid[a][b].equals("•")) {//check if first player has row
								if ( (a-1) != 0 && grid[a-1][b].equals("•")) {
									if ( (a-2) != 0 && grid[a-2][b].equals("•")) {
										if ( (a-3) != 0 && grid[a-3][b].equals("•")) {
											winner = player1;
											win = true;} //stop code
										}}}//if not go back and search the rest
							else if ( a != 0 && grid[a][b].equals("♦")) {//check if second player has row
									if ( (a-1) != 0 && grid[a-1][b].equals("♦")) {
										if ( (a-2) != 0 && grid[a-2][b].equals("♦")) {
											if ( (a-3) != 0 && grid[a-3][b].equals("♦")) {
												winner = player2;
												win = true;} //stop code
											}}}}}
					//DIAGONAL CHECK
					//P1
					count = 0; bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if ( grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; diagonal < 9; diagonal++) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((a+b) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") {
											count += 1;}
										else if (grid[a][b] != "♦") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P1
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "•") {
											count += 1;}
										else if  (grid[a][b] != "•") { //check if matches
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}
					//P2
					count = 0; bound = 0;
					for ( int diagonal = 3; -2 <= diagonal ; diagonal--) { //checking diagonals 
						for ( int a = 0; a < row; a++) {
							for ( int b = 0; b < column; b++) {
								if ((b-a) == diagonal) {
									if ((bound==0 && count!=4) || count==0) {
										if ( count==0) {
											bound=0;}
										if ( grid[a][b] == "♦") { //check if matches
											count += 1;}
										else if (grid[a][b] != "♦") {
											bound=1;
											count=0;}}}}}
						if ( count == 4 && bound==0) {
												winner = player1; //declare winner 
												bound = 0;
												win = true;}}//end check

				}while(win == false);
				//OUTPUT grid with number columns.
				System.out.println("   COLUMN"); //output title
				System.out.println("~~~~~~~~~~~~~"); //divider 
				System.out.println("1 2 3 4 5 6 7"); //output column number
				System.out.println("~~~~~~~~~~~~~"); //divider 
				for (int a = 0 ; a < row ; a++) {
					for(int b = 0 ; b < column ; b++) {
						System.out.print(grid[a][b]+" ");}
					System.out.println();}
				System.out.println("~~~~~~~~~~~~~\n"); //divider 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //divider 
				System.out.println("\t\t "+ winner+" WINS!"); 
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); //divider 
			}//end of versing winner
			
			else {
				System.out.println("Error. Invailid input\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				choiceCheck = 1;}
			
		}while(choiceCheck == 1);
		
	}
}

