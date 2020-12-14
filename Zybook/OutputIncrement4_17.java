package Zybook;

import java.util.Scanner;

public class OutputIncrement4_17 {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);

	int num1 = s.nextInt();
	int num2 = s.nextInt();
	boolean larger = false;

	if (num1 > num2) {
		System.out.print("Second integer can't be less than the first.");
		larger = true;
	}
	while (!larger) {
		System.out.print(num1 + " ");
		num1 += 10;
		if (num1 > num2) larger = true;
	}
	System.out.print("\n");
	s.close();
	}
}