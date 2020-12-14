package Zybook;

import java.util.Scanner;

public class Nomalize6_22 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int[] values = new int[num]; // Set of data specified by the user
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= num - 1; i++) {
			int addNum = scnr.nextInt();
			if (addNum < min)
				min = addNum;
			values[i] = addNum;
		}
		for (int i = 0; i <= values.length - 1; i++) {
			System.out.print((values[i] - min) + " ");
		}
		System.out.println();
		scnr.close();
	}
}