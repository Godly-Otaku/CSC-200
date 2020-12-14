package Unit5;

import java.util.Scanner;

public class Even {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		System.out.println("How many numbers would you like to check?");
		int input = scnr.nextInt();
		while (input > 0) {
			for (int i = 1; i <= input; i++) {
				int number = scnr.nextInt();
				if (isEven(number) == true)
					System.out.println(number + " is even");
				else 
					System.out.println(number + " is not even");
			}
			scnr.close();
			System.exit(0);
		}
	}
	public static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		else 
			return false;
	}
}