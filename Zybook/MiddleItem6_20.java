package Zybook;

import java.util.Scanner;

public class MiddleItem6_20 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] values = new int[9]; // Set of data specified by the user
		int i = 0;
		int num = scnr.nextInt();
		while (num > 0) {
			if (num < 0)
				break;
			if (i >= 9) {
				System.out.println("Too many inputs");
				scnr.close();
				System.exit(0);
			}
			values[i] = num;
			i++;
			num = scnr.nextInt();
		}
		System.out.println(values[(i / 2)]);
		scnr.close();
	}
}