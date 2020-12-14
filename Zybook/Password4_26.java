package Zybook;

import java.util.Scanner;
import java.util.Arrays;

public class Password4_26 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String input = scnr.nextLine().trim();
		boolean tooShort = false;
		boolean noLetter = true;
		boolean noNum = true;
		boolean noSpecial = true;

		if (input.length() < 8) {
			tooShort = true;
			System.out.println("Too short");
		}
		char[] letters = input.toCharArray();
		Character[] special = { '!', '#', '%' };
		for (int index = 0; index <= letters.length - 1; index++) {
			if (Character.isDigit(letters[index])) {
				noNum = false;
			}
			if (Character.isLetter(letters[index])) {
				noLetter = false;
			}
			if (Arrays.asList(special).contains(letters[index])) {
				noSpecial = false;
			}
		}
		if (noLetter) {
			System.out.println("Missing letter");
		}
		if (noNum) {
			System.out.println("Missing number");
		}
		if (noSpecial) {
			System.out.println("Missing special");
		}
		if (!tooShort && !noLetter && !noNum && !noSpecial)
			System.out.println("OK");
		scnr.close();
	}
}