package Unit5;
import java.util.Scanner;

public class MyRPS {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Your turn - select a number for your choice:");
		System.out.println("1 for Rock, 2 for Paper, 3 for Scissors.");
		int input = scnr.nextInt();
		int computer = (int)(Math.random() * 3) + 1;

		int rock = 1;
		int paper = 2;
		int scissors = 3;
		Object[][] choices = {{ "rock", 1 }, { "paper", 2 }, { "scissors", 3 }};
		
		if (input == computer) {
			System.out.println("Result: Tie");
			System.out.println("You both picked " + choices[input - 1][0]);
		}
		if (((input == rock) && (computer == scissors)) || ((input == paper) && (computer == rock)) || ((input == scissors) && (computer == paper))) {
			System.out.println("Result: Player Wins!!!");
			System.out.println("You picked " + choices[input - 1][0]);
			System.out.println("Computer picked " + choices[computer - 1][0]);
		}
		if (((computer == rock) && (input == scissors)) || ((computer == paper) && (input == rock)) || ((computer == scissors) && (input == paper))) {
			System.out.println("Result: Computer Wins!!!");
			System.out.println("You picked " + choices[input - 1][0]);
			System.out.println("Computer picked " + choices[computer - 1][0]);
		}
		scnr.close();
	}
}