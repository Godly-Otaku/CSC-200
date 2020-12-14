package Zybook;

import java.util.Scanner;

public class Welcome2_32 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String input = scnr.next();

		System.out.println("Hello " + input + ", and welcome to CS Online!");
		scnr.close();
	}
}