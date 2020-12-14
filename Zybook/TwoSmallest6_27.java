package Zybook;

import java.util.Scanner;

public class TwoSmallest6_27 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int[] values = new int[num]; // Set of data specified by the user
		for (int i = 0; i <= num - 1; i++) {
			int addNum = scnr.nextInt();
			values[i] = addNum;
		}
		for (int i = 0; i < num - 1; i++) {
			int min = i;
			for (int index = i + 1; index < num; index++) {
				if (values[index] < values[i]) {
					min = index;
					values[min] += values[i];
					values[i] = values[min] - values[i];
					values[min] = values[min] - values[i];
				}
			}
		}
		System.out.println(values[0] + " " + values[1]);
		scnr.close();
	}
}