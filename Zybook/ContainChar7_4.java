package Zybook;

import java.util.*;

public class ContainChar7_4 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// int num = scnr.nextInt();
		String input = scnr.nextLine().trim();
		char[] letters = input.toCharArray();
		char letter = letters[letters.length - 1];
		String[] words = input.split(" ");
		for (int i = 0; i < words.length - 1; i++) {
			if (words[i].contains(letter + ""))
				System.out.println(words[i]);
		}
		scnr.close();
	}
}