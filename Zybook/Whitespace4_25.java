package Zybook;

import java.util.Scanner;

public class Whitespace4_25 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Using trim() does all of this but ok
		String input = scnr.nextLine();
		String clean = "";
		int startString = 0;
		int endString = 0;
		char[] letters = input.toCharArray();
		if ((input.equals("")) || (input.trim().isEmpty()))
			System.exit(0);
		for (int index = 0; index <= letters.length - 1; index++) {
			if (letters[index] != ' ') {
				startString = index;
				break;
			}
		}
		for (int index = letters.length - 1; index >= 0; index--) {
			if (letters[index] != ' ') {
				endString = index;
				break;
			}
		}
		for (int index = startString; index <= endString; index++) {
			clean += letters[index];
		}
		System.out.println(clean);
		scnr.close();
	}
}