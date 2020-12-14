package Zybook;

import java.util.Scanner;

public class OutputRange6_23 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = scnr.nextInt();
		int[] values = new int[num]; // Set of data specified by the user
		for (int i = 0; i <= num - 1; i++) {
			int addNum = scnr.nextInt();
			values[i] = addNum;
		}
		int downRange = scnr.nextInt();
		int upRange = scnr.nextInt();
		for (int i = 0; i <= values.length - 1; i++) {
			if ((values[i] >= downRange) && (values[i] <= upRange))
				System.out.print(values[i] + " ");
		}
		System.out.println();
		scnr.close();
	}
}