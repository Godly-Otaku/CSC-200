package Zybook;

import java.util.*;

public class WordFreq7_1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int amount = scnr.nextInt();
		String[] arguments = scnr.nextLine().trim().split(" ");
		for (int i = 0; i < arguments.length; i++) {
			if (i > amount)
				break;
			int c = 0;
			for (int j = 0; j < arguments.length; j++) {
				if (arguments[i].equals(arguments[j]))
					c++;
			}
			System.out.println(arguments[i] + " " + c);
		}
		scnr.close();
	}
}