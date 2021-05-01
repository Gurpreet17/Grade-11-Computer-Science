import java.util.Scanner;
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//INITIALIZING VARIABLES
		boolean turn = true;
		boolean win = false;
		String winner = "no one";
		int row=7;
		int column=7;
		String [] [] grid = new String [row][column]; 
		for (int a=0; a<row; a++) {
			for (int b=0; b<column; b++) {
				grid[a][b] = " ◦ ";
			}
		}
		
		//PLAYER INFORMATIONS
		System.out.println("Enter player 1 name:");
		String player1 = input.next();
		System.out.println("Enter player 2 name:");
		String player2 = input.next();
		
		do {
			turn=true;
			//PLAYER 1 TURN
			if (turn==true && win==false) {
				boolean inputcheck = false;
				while (inputcheck==false) {
					for (int a=0; a<=row-1; a++) {
						for (int b=0; b<=column-1; b++) {
							System.out.print(grid[a][b]);
						}
						System.out.println();
					}
					System.out.println(player1 + " enter column you would like to insert your token:");
					int playerinput = input.nextInt()-1;
					if (playerinput<0 || playerinput>column-1) {
						System.out.println("Invalid column ! Try again");
						inputcheck = false;
					}
					else {
						for (int a=row-1; a>=0; a--) {
							if (grid[a][playerinput] == " ◦ ") {
								grid[a][playerinput] = " • "; 
								inputcheck=true;
								break;
								
							}
							else if (grid[0][playerinput]== " • " || grid[0][playerinput]== " ■ " ) {
								System.out.println("Collumn is filled!");
								inputcheck=false;
								break;
							}
						}
					}
				}
				turn = false;
			}
			turn = true;
			//TIE CHECK
			for (int b=0; b<column-1; b++) {
				int count=0;
				if (grid[0][b] == " • " || grid[0][b] == " ■ "  && count>=column-1) {
					count ++;
				}
				if (count==column-1) {
					System.out.println("Tie Game!");
				}
			}
			
			//WIN CHECK
			//vertical check for Player 1
			for (int a=0; a<row-1; a++) {
				for (int b=0; b<column-1; b++) {
					if (a<row-1 && grid[a][b] == " • ") {
						if ((a+1<row-1 && grid[a+1][b] == " • ")) {
							if ((a+2<row-1 && grid[a+2][b] == " • ")) {
								if ((a+3<row-1 && grid[a+3][b] == " • ")) {
									winner = player1;
									System.out.println("The winner is " + winner);
									win = true;
									break;
								}
							}
						}
					}
					//vertical check for Player 2
					else if (a<row-1 && grid[a][b] == " ■ ") {
						if ((a+1)<row-1 && grid[a+1][b] == " ■ ") {
							if ((a+2)<row-1 && grid[a+2][b] == " ■ ") {
								if ((a+3)<row-1 && grid[a+3][b] == " ■ ") {
									winner = player2;
									System.out.println("The winner is " + winner);
									win = true;
									break;
								}
							}
						}
					}
				}
			}
			
			//Horizontal Check
			//Horizontal check for Player 1
			if (turn==true && win ==false) {
				for (int a= row-1; a>0; a--) {
					for (int b=column-1; b>0; b--) {
						if (b>0 && grid[a][b] == " • ") {
							if ((b-1)>0 && grid[a][b-1] == " • ") {
								if ((b-2)>0 && grid[a][b-2] == " • ") {
									if ((b-3)>0 && grid[a][b-3] == " • ") {
										winner = player1;
										System.out.println("The winner is " + winner);
										win = true;
										break;
									}
								}
							}
						}
				//Horizontal check for Player 2
						else if (b>0 && grid[a][b] == " ■ " ) {
							if ((b-1)>0 && grid[a][b-1] == " ■ ") {
								if ((b-2)>0 && grid[a][b-2] == " ■ ") {
									if ((b-3)>0 && grid[a][b-3] == " ■ ") {
										winner = player2;
										System.out.println("The winner is " + winner);
										win = true;
										break;
									}
								}
							}
						}
					}
				}
			}
			 
		
			//PLAYER 2 TURN
			if (turn==true && win==false) {
				boolean inputcheck = false;
				while (inputcheck==false) {
					for (int a=0; a<=row-1; a++) {
						for (int b=0; b<=column-1; b++) {
							System.out.print(grid[a][b]);
						}
						System.out.println();
					}
					System.out.println(player2 + " enter column you would like to insert your token:");
					int playerinput = input.nextInt()-1;
					if (playerinput<0 || playerinput>column-1) {
						System.out.println("Invalid column ! Try again");
						inputcheck = false;
					}
					else {
						for (int a=row-1; a>=0; a--) {
							if (grid[a][playerinput] == " ◦ ") {
								grid[a][playerinput] = " ■ " ; 
								inputcheck=true;
								break;
							}
							else if (grid[0][playerinput]== " • " || grid[0][playerinput] == " ■ " ) {
								System.out.println("Collumn is filled!");
								inputcheck=false;
								break;
							}
						}
					}
				}
				turn = false;
			}
			//TIE CHECK
			for (int b=0; b<column-1; b++) {
				int count=0;
				if (grid[0][b] == " • " || grid[0][b] == " ■ "  && count>=column-1) {
					count ++;
				}
				if (count==column-1) {
					System.out.println("Tie Game!");
				}
			}
			
			//WIN CHECK
			//vertical check for Player 1
			if (win==false) {
				for (int a=0; a<row-1; a++) {
					for (int b=0; b<column-1; b++) {
						if (a<row-1 && grid[a][b] == " • ") {
							if ((a+1)<row-1 && grid[a+1][b] == " • ") {
								if ((a+2)<row-1 && grid[a+2][b] == " • ") {
									if ((a+3)<row-1 && grid[a+3][b] == " • ") {
										winner = player1;
										System.out.println("The winner is " + winner);
										win = true;
										break;
									}
								}
							}
						}
				//vertical check for Player 2
						else if (a<row-1 && grid[a][b] == " ■ ") {
							if ((a+1)<row-1 && grid[a+1][b] == " ■ ") {
								if ((a+2)<row-1 && grid[a+2][b] == " ■ ") {
									if ((a+3)<row-1 && grid[a+3][b] == " ■ ") {
										winner = player2;
										System.out.println("The winner is " + winner);
										win = true;
										break;
									}
								}
							}
						}
					}
				}
			}
			//Horizontal Check
			//Horizontal check for Player 1
			if (turn==true && win ==false) {
				for (int a= row-1; a>0; a--) {
					for (int b=column-1; b>0; b--) {
						if (b>0 && grid[a][b] == " • ") {
							if ((b-1)>0 && grid[a][b-1] == " • ") {
								if ((b-2)>0 && grid[a][b-2] == " • ") {
									if ((b-3)>0 && grid[a][b-3] == " • ") {
										winner = player1;
										System.out.println("The winner is " + winner);
										win = true;
										break;
									}
								}
							}
						}
				//Horizontal check for Player 2
						else if (b>0 && grid[a][b] == " ■ " ) {
							if ((b-1)>0 && grid[a][b-1] == " ■ ") {
								if ((b-2)>0 && grid[a][b-2] == " ■ ") {
									if ((b-3)>0 && grid[a][b-3] == " ■ ") {
										winner = player2;
										System.out.println("The winner is " + winner);
										win = true;
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		while (win==false);
		 
	}
	
		
	

}


