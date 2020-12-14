package Zybook;

import java.util.Scanner;

public class OutputDigits4_24 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int input = scnr.nextInt();
		int last = input % 10;
		int c = 0;
		while (last != 0) {
			System.out.println(last);
			c++;
			last = input / (int) (Math.pow(10, c));
			last %= 10;
		}
		scnr.close();
	}
}