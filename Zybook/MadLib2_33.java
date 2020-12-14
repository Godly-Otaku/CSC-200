package Zybook;

import java.util.Scanner;

public class MadLib2_33 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String name = scnr.next();
		String location = scnr.next();
		int number = scnr.nextInt();
		String item = scnr.next();

		System.out.println(name + " went to " + location + " to buy " + number + " different types of " + item + ".");
		scnr.close();
	}
}