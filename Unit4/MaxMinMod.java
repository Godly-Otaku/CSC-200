package Unit4;

import java.util.Scanner;

public class MaxMinMod {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a positive integer or a negative to stop");
		int num = s.nextInt();
		int max = num;
		int min = num;
		int sum = num;
		int c = 1;

		while (num >= 0) {
			System.out.println("Anymore numbers? (Negative to quit)");
			num = s.nextInt();
			if ((num > max) && (num >= 0)) { // Maximum
				max = num;
			}
			if ((num < min) && (num >= 0)) { // Minimum
				min = num;
			}
			c++;
			sum += num;
		}
		System.out.println("Sum: " + (sum - num));
		System.out.println("Range: " + (max - min));
		System.out.println("Average: " + ((sum - num) / (c - 1)));
		s.close();
	}
}