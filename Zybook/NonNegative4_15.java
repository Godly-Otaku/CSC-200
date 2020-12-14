package Zybook;

import java.util.Scanner;

public class NonNegative4_15 {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);

	int num = s.nextInt();
	int max = num;
	int sum = num;
	int c = 1;

	while (num >= 0) {
		num = s.nextInt();
		if ((num > max) && (num >= 0)) { // Maximum
			max = num;
		}
		c++;
		sum += num;
	}
	System.out.println(( (sum - num) / (c - 1)) + " " + max);
	s.close();
	}
}