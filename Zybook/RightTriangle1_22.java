package Zybook;

import java.util.Scanner;

public class RightTriangle1_22 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a character:");
		char trichar = scnr.next().charAt(0);

		System.out.println("Enter triangle height:\n");
		int size = scnr.nextInt();

		for (int length = 1; length <= size; length++) {
			for (int width = 1; width <= length; width++) {
				System.out.print(trichar + " ");
			}
			System.out.println();
		}
		scnr.close();
	}
}