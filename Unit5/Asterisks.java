package Unit5;

import java.util.Scanner;

public class Asterisks {
	public static void main(String[] args){
	Scanner scnr = new Scanner(System.in);
		
	System.out.println("What size do you want the square to be?");
	squareOfAsterisks(scnr.nextInt());
	scnr.close();
	}
	public static void squareOfAsterisks(int size) {
		for (int side1 = 1; side1 <= size; side1++){
			for (int side2 = 1; side2 <= size; side2++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}