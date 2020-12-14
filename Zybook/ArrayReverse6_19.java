package Zybook;

import java.util.Scanner;

public class ArrayReverse6_19 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int[] list = new int[20];
		if (num > 20)
			System.exit(0);

		for (int i = 0; i <= num - 1; i++) {
			int addNum = scnr.nextInt();
			list[i] = addNum;
		}
		for (int i = list.length - 1; i >= 0; i--) {
			if (list[i] != 0)
				System.out.print(list[i] + " ");
		}
		System.out.println();
		scnr.close();
	}
}