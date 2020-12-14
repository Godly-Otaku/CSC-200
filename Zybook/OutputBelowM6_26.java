package Zybook;

import java.util.Scanner;

public class OutputBelowM6_26 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int[] values = new int[num]; // Set of data specified by the user
		getUserValues(values, values.length, scnr);
		int range = scnr.nextInt();
		outputIntsLessThanOrEqualToThreshold(values, values.length, range);
		scnr.close();
	}

	public static void getUserValues(int[] myArr, int arrSize, Scanner scnr) {
		for (int i = 0; i <= arrSize - 1; i++) {
			int addNum = scnr.nextInt();
			myArr[i] = addNum;
		}
	}

	public static void outputIntsLessThanOrEqualToThreshold(int[] values, int userValsSize, int range) {
		for (int i = 0; i <= values.length - 1; i++) {
			if (values[i] <= range)
				System.out.print(values[i] + " ");
		}
		System.out.println();
	}
}