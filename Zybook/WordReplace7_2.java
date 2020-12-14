package Zybook;

import java.util.*;

public class WordReplace7_2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// int replaceNum = scnr.nextInt();
		String input = scnr.nextLine();
		String str = "";
		String[] replaceArgs = input.trim().split("  ");
		for (String x : replaceArgs) {
			x = x.trim();
			str += x + " ";
		}
		String[] finalReplace = str.trim().split(" ");
		// int numWords = scnr.nextInt();
		String sentence = scnr.nextLine();
		String[] wordList = sentence.trim().split(" ");
		String finalstr = "";
		for (int i = 0; i < finalReplace.length / 2; i++) {
			int replace = findWordInWordList(wordList, finalReplace[i], i);
			while (replace >= 0) {
				wordList[replace] = finalReplace[i + 1];
				replace = findWordInWordList(wordList, finalReplace[i], i);
			}
		}
		for (String x : wordList) {
			finalstr += x + " ";
		}
		System.out.println(finalstr);
		scnr.close();
	}

	public static int findWordInWordList(String[] wordList, String wordToFind, int numInList) {
		int value = -1;
		for (int i = 0; i < wordList.length; i++) {
			if (wordList[i].equals(wordToFind)) {
				value = i;
				break;
			}
		}
		return value;
	}
}