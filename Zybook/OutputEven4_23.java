package Zybook;

import java.util.Scanner;

public class OutputEven4_23 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int n = scnr.nextInt();

		String output = "";
		if (n < 0) {
			output = "0 ";
		} else {
			if (n % 2 == 0) {
				for (int i = n; i >= 0; i -= 2) {
					output += i + " ";
				}
			} else {
				for (int i = n - 1; i >= 0; i -= 2) {
					output += i + " ";
				}
			}
		}
		System.out.println("Sequence: " + output);
		scnr.close();
	}
}