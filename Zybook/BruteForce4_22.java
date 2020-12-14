package Zybook;

import java.util.Scanner;

public class BruteForce4_22 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int x = scnr.nextInt();
		int y = scnr.nextInt();
		int z = scnr.nextInt();
		int xa = scnr.nextInt();
		int ya = scnr.nextInt();
		int za = scnr.nextInt();

		for (int i = -10; i <= 10; i++) {
			for (int index = -10; index <= 10; index++) {
				if (((x * i) + (y * index) == z) && ((xa * i) + (ya * index) == za)) {
					System.out.println(i + " " + index);
					System.exit(0);
				} else if (i == 10) {
					System.out.println("No solution");
					break;
				}
			}
			scnr.close();
		}
	}
}