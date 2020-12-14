package Zybook;

import java.util.*;

public class WordFreqM7_5 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int amount = scnr.nextInt();
		String[] arguments = scnr.nextLine().trim().split(" ");
		for (int i = 0; i < arguments.length; i++) {
			if (i > amount)
				break;
			System.out.println(arguments[i] + " " + getFrequencyOfWord(arguments, amount, arguments[i]));
		}
		scnr.close();
	}

	public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
		int c = 0;
		for (int i = 0; i < listSize; i++) {
			if (i > listSize)
				break;
			if (currWord.equals(wordsList[i]))
				c++;
		}
		return c;
	}
}