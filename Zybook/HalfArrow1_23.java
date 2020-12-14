package Zybook;

import java.util.Scanner;

public class HalfArrow1_23 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter arrow base height:");
		int baseH = scnr.nextInt();

		System.out.println("Enter arrow base width:");
		int baseW = scnr.nextInt();

		System.out.println("Enter arrow head width:");
		int size = scnr.nextInt();

		while (size <= baseW) {
			System.out.println("Enter arrow head width:");
			size = scnr.nextInt();
		}
		System.out.println("");

		for (int length = 1; length <= baseH; length++) {
			for (int width = 1; width <= baseW; width++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int length = 1; length <= size; length++) {
			for (int width = size; width >= length; width--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scnr.close();
	}
}