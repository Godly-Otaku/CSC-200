package Zybook;

import java.util.*;

public class ContactList7_7 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int replaceNum = scnr.nextInt();
		String input = scnr.nextLine().trim();
		String name = "";
		String num = "";
		String[] nameNum = input.trim().split(" ");
		for (int i = 0; i < nameNum.length - 1; i++) {
			if (i % 2 == 0)
				name += nameNum[i] + " ";
			else
				num += nameNum[i] + " ";
		}
		String[] names = name.split(" ");
		String[] numbers = num.split(" ");
		String request = nameNum[nameNum.length - 1];
		System.out.println(getPhoneNumber(names, numbers, request, replaceNum));
		scnr.close();
	}

	public static String getPhoneNumber(String[] names, String[] numbers, String contactName, int arraySize) {
		String number = "";
		for (int i = 0; i < arraySize; i++) {
			if (names[i].equals(contactName))
				number = numbers[i];
		}
		return number;
	}
}