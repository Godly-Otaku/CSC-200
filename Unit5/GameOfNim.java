package Unit5;

/*
Byron Washington
Unit 5 Project
10/18/2020
The Game of Nim: 
User input: Move you want to make
Output: Computer moves, game settings, who wins
*/
import java.util.Scanner;
import java.util.Arrays;

public class GameOfNim {
	public static int turnCounter = (int) (Math.random() * 2) + 1;
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in); 
		int numOfMarbles = (int) (Math.random() * 100) + 10;	//Set the number of marbles between 10-100
		
		if (!smartMode()) { //Stupid Mode
			if (turnCounter % 2 == 0) System.out.println("The computer will go first");	//Flips a coin to see who goes first
			else  System.out.println("You will go first");
			System.out.println("The computer is in stupid mode");
			System.out.println("Total Marbles: " + numOfMarbles);
			//Starting print statments^^^
			while (numOfMarbles > 0) {	//While the game is still going
				if (!computerTurn()) {	//If it's the player's turn
					if (numOfMarbles == 1) {	//If it's on the last marble
						System.out.println("There is 1 marble left.");
						System.out.println("You took the last marble. Computer Wins!!!");
						System.exit(0);
					} else {	//If it isn't on the last marble
						System.out.println("There are " + numOfMarbles + " marbles left.");
						if ((numOfMarbles == 2) || (numOfMarbles == 3)) System.out.println("You can only take 1 marble: ");	//If you can only take one marble
						else System.out.println("Take a number between " + (numOfMarbles / 2) + " and 1: ");
						int taken = scnr.nextInt();	//Input number of marbles to take
						while ((taken > (numOfMarbles / 2)) || (taken < 1)) {	//loop if player does illegal move
							System.out.println("Illegal Move");
							System.out.println("Take a number between " + (numOfMarbles / 2) + " and 1: ");
							taken = scnr.nextInt();
						}
						numOfMarbles -= taken;
						System.out.println("You took " + taken + " marble(s).");
						++turnCounter;	//Switches turn
					}
				} else {
					if (numOfMarbles == 1) {	//If it's on the last marble
						System.out.println("There is 1 marble left.");
						System.out.println("Computer took the last marble. Player Wins!!!");
						System.exit(0);
					} else {
						System.out.println("There are " + numOfMarbles + " marbles left.");
						int taken = getComputerStupidMove(numOfMarbles);
						numOfMarbles -= taken;
						System.out.println("The computer took " + taken + " marble(s).");
						++turnCounter;	//Switches turn
					}
				}
			}
		} else { //Smart Mode
			if (turnCounter % 2 == 0) System.out.println("The computer will go first");	//Flips a coin to see who goes first
			else  System.out.println("You will go first");
			System.out.println("The computer is in smart mode");
			System.out.println("Total Marbles: " + numOfMarbles);
			//Starting print statments^^^
			while (numOfMarbles > 0) {	//While the game is still going
				if (!computerTurn()) {	//If it's the player's turn
					if (numOfMarbles == 1) {	//If it's on the last marble
						System.out.println("There is 1 marble left.");
						System.out.println("You took the last marble. Computer Wins!!!");
						System.exit(0);
					} else {	//If it isn't on the last marble
						System.out.println("There are " + numOfMarbles + " marbles left.");
						if ((numOfMarbles == 2) || (numOfMarbles == 3)) System.out.println("You can only take 1 marble: ");	//If you can only take one marble
						else System.out.println("Take a number between " + (numOfMarbles / 2) + " and 1: ");
						int taken = scnr.nextInt();	//Input number of marbles to take
						while ((taken > (numOfMarbles / 2)) || (taken < 1)) {	//loop if player does illegal move
							System.out.println("Illegal Move");
							System.out.println("Take a number between " + (numOfMarbles / 2) + " and 1: ");
							taken = scnr.nextInt();
						}
						numOfMarbles -= taken;
						System.out.println("You took " + taken + " marble(s).");
						++turnCounter;	//Switches turn
					}
				} else {
					if (numOfMarbles == 1) {	//If it's on the last marble
						System.out.println("There is 1 marble left.");
						System.out.println("Computer took the last marble. Player Wins!!!");
						System.exit(0);
					} else {
						System.out.println("There are " + numOfMarbles + " marbles left.");
						int taken = getComputerSmartMove(numOfMarbles);
						numOfMarbles -= taken;
						System.out.println("The computer took " + taken + " marble(s).");
						++turnCounter;	//Switches turn
					}
				}
			}
		}
		scnr.close();
	}
	public static boolean smartMode() {
		int yesNo = (int) (Math.random() * 4) + 1;
		if (yesNo % 2 == 0) return true;	//Computer is in smart mode
		else return false;	//Computer is in stupid mode
	}
	public static boolean computerTurn() {
		if (turnCounter % 2 == 0) {	//If it's an even number, it's the computer's turn
			return true;
		}
		else  {
			return false;
		}
	}
	public static int getComputerStupidMove(int num) {
		return (int) (Math.random() * (num / 2) + 1);	//Computer does a random legal move
	}
	public static int getComputerSmartMove(int num) {
		Integer[] minusPowers = {2, 3, 7, 15, 31, 63, 127};	//Set of powers of 2 minus 1
		int finalMove = 0;
		if (Arrays.asList(minusPowers).contains(num)) {	//If the current number of marbles is in the set, do random legal move
			finalMove = (int) (Math.random() * (num / 2) + 1);
		} else {
			for (int i = 0; i < minusPowers.length; i++) {	//Find which number in the set it's less than
				if (minusPowers[i] > num) {
					finalMove =  num - minusPowers[i - 1];	//Subtract by the one before in set
					break;
				}
			}
		}
		return finalMove;
	}
}
/*
The computer will go first
The computer is in stupid mode
Total Marbles: 34
There are 34 marbles left.
The computer took 3 marble(s).
There are 31 marbles left.
Take a number between 15 and 1:
15
You took 15 marble(s).
There are 16 marbles left.
The computer took 3 marble(s).
There are 13 marbles left.
Take a number between 6 and 1:
6
You took 6 marble(s).
There are 7 marbles left.
The computer took 2 marble(s).
There are 5 marbles left.
Take a number between 2 and 1:
2
You took 2 marble(s).
There are 3 marbles left.
The computer took 1 marble(s).
There are 2 marbles left.
You can only take 1 marble:
1
You took 1 marble(s).
There is 1 marble left.
Computer took the last marble. Player Wins!!!
*/