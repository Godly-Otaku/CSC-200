package Unit4;

import java.util.Scanner;

public class SolidSquare {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		
	System.out.println("What size do you want the square to be?");
	int size = s.nextInt();

		for (int side1 = 1; side1 <= size; side1++){
			for (int side2 = 1; side2 <= size; side2++){
				System.out.print("*");
			}
			System.out.println();
		}
	s.close();
	}
}