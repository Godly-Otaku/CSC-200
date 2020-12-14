package Unit2;

import java.util.Scanner;

public class Math {
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter 3 integers");

		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();

		double sum = a + b + c;
		int prod = a * b * c;
		double avg = (double) sum / 3;

		System.out.printf("For your numbers: [" + a + ", " + b + ", " + c + "]\nSum = " + sum + "\nProduct = " + prod + "\nAverage = %.2f", avg);
		keyboard.close();
	}
}