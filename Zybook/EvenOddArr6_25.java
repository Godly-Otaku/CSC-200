package Zybook;

import java.util.Scanner;

public class EvenOddArr6_25 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int[] values = new int[num]; // Set of data specified by the user
		for (int i = 0; i <= num - 1; i++) {
			int addNum = scnr.nextInt();
			values[i] = addNum;
		}
		if (isArrayEven(values, values.length) && !(isArrayOdd(values, values.length))) {
			System.out.println("all even");
		} else if (!(isArrayEven(values, values.length)) && isArrayOdd(values, values.length)) {
			System.out.println("all odd");
		} else {
			System.out.println("not even or odd");
		}
		scnr.close();
	}

	public static boolean isArrayEven(int[] arr, int size) {
		boolean yes = true;
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 != 0) {
				yes = false;
			}
		}
		return yes;
	}

	public static boolean isArrayOdd(int[] arr, int size) {
		boolean yes = true;
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				yes = false;
			}
		}
		return yes;
	}
}