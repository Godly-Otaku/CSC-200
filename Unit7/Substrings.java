package Unit7;

import java.util.Scanner;

public class Substrings {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String input = scnr.nextLine();
		String lower = input.toLowerCase();
		char[] letters = lower.toCharArray();
		int firstSpace = 0;
		for (int i = 0; i < letters.length; i++) {
			if(letters[i] == ' ') {
				firstSpace = i;
				break;
			}
		}
		String firstLetter = lower.substring(0, 1);
		String lastNameLetters = lower.substring(firstSpace + 1, firstSpace + 4);
		String lastNumbers = lower.substring(lower.length() - 2);
		String finalOutput = firstLetter + lastNameLetters + lastNumbers;
		System.out.println(finalOutput);
		scnr.close();
	}
}