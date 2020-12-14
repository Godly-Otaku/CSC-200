package Zybook;

import java.util.Scanner;

public class MatchingDigits4_16 {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);

	int num = s.nextInt();
	boolean sameNum = false;

	if ((num < 20) || (num > 98)) {
			System.out.print("Input must be 20-98");
			sameNum = true;
	}
	while (!sameNum) {
		int digit1 = num / 10;
		int digit2 = num % 10;
		if (digit1 == digit2) sameNum = true;
		System.out.print(num + " ");
		num--;
	} System.out.print("\n");
	s.close();
	}
}