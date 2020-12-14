package Zybook;

import java.util.*;

public class CountChars7_3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		char letter = scnr.next().charAt(0);
		String input = scnr.nextLine().trim();
		System.out.println(countCharacters(letter, input));
		scnr.close();
	}

	public static int countCharacters(char userChar, String userString) {
		int counter = 0;
		char[] letters = userString.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == userChar)
				counter++;
		}
		return counter;
	}
}