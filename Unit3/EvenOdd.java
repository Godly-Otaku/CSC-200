package Unit3;

import java.util.Scanner;

public class EvenOdd {
   public static void main(String[] args) {
   	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter an integer to determine if it is odd or even: ");
	int userNum = keyboard.nextInt();

	if (userNum % 2 == 0) {
		System.out.print("The number " + userNum + " is an even number");
	} else {
		System.out.print("The number " + userNum + " is an odd number");
	}
	keyboard.close();
	}
}