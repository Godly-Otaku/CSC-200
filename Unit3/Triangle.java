package Unit3;

import java.util.Scanner;

public class Triangle {
   public static void main(String[] args) {
   	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter 3 integers to see if they form a right triangle");
	int a = keyboard.nextInt();
	int b = keyboard.nextInt();
	int c = keyboard.nextInt();

	if ((a * a) + (b * b) == (c * c)) {
		System.out.print("They can form a right triangle");
	} else {
		System.out.print("They can't form a right triangle");
	}
	keyboard.close();
	}
}