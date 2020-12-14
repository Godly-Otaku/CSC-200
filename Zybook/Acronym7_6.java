package Zybook;

import java.util.*;

public class Acronym7_6 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input = scnr.nextLine().trim();
		System.out.println(createAcronym(input));
		scnr.close();
	}

	public static String createAcronym(String userPhrase) {
		String acronym = "";
		String[] words = userPhrase.split(" ");
		for (int i = 0; i < words.length; i++) {
			char first = words[i].toCharArray()[0];
			if (Character.isUpperCase(first))
				acronym += first;
		}
		return acronym;
	}
}