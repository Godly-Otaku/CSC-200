package Unit7;

import java.util.Scanner;

public class UpperChar {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String input = scnr.next();
		String uppercase = input.toUpperCase();
		char[] letters = uppercase.toCharArray();
		for (char x: letters) {
			System.out.println(x);
		}
		scnr.close();
	}
}