package Unit3;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
		
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int digit5;

		System.out.println("Enter a 5 digit integer");
		int number = keyboard.nextInt();
		if ((number < 10000) || (number > 99999)) {
			System.out.println("That number isn't 5 digits");
			System.exit(0);
		}
		digit1 = number / 10000;
		digit2 = (number / 1000) % 10;
		digit3 = (number / 100) % 10;
		digit4 = (int) (number % 100) / 10; // I didn't wanna just follow the same pattern so I found a different way
		digit5 = number % 10;

		if ((digit4 == digit2) && (digit5 == digit1)) {
			System.out.println("Each Digit:   " + digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5 + "\nNumber is a Palindrome");
		} else {
			System.out.println("Each Digit:   " + digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5 + "\nNumber is not a Palindrome");
		}
		keyboard.close();
	}
}