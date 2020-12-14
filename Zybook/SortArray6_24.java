package Zybook;

import java.util.Scanner;

public class SortArray6_24 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int[] values = new int[num]; // Set of data specified by the user
		for (int i = 0; i <= num - 1; i++) {
			int addNum = scnr.nextInt();
			values[i] = addNum;
		}
		sortArray(values, values.length);
		scnr.close();
	}

	public static void sortArray(int[] myArr, int arrSize) {
		// I only know selection method
		for (int i = 0; i < arrSize - 1; i++) {
			int min = i;
			for (int index = i + 1; index < arrSize; index++) {
				if (myArr[index] < myArr[i]) {
					min = index;
					myArr[min] += myArr[i];
					myArr[i] = myArr[min] - myArr[i];
					myArr[min] = myArr[min] - myArr[i];
				}
			}
		}
		for (int i = 0; i < arrSize; i++) {
			System.out.print(myArr[i] + " ");
		}
		System.out.println();
	}
}