package Unit3;

import java.util.Scanner;

public class Comparing {
   public static void main(String[] args) {
   	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter 2 integers to see which is larger: ");
	int firstNum = keyboard.nextInt();
	int secNum = keyboard.nextInt();
	
	if (firstNum > secNum) {
		System.out.print("The number " + firstNum + " is bigger than " + secNum);
	} else if (firstNum < secNum) {
		System.out.print("The number " + firstNum + " is smaller than " + secNum);
	} else {
		System.out.print("The number " + firstNum + " and " + secNum + " are equal");
	}
	keyboard.close();
	}
}