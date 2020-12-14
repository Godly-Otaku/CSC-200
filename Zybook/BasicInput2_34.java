package Zybook;

import java.util.Scanner;

public class BasicInput2_34 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter integer:");
		int first = scnr.nextInt();
		System.out.println("Enter double:");
		double second = scnr.nextDouble();
		System.out.println("Enter character:");
		char third = scnr.next().charAt(0);
		System.out.println("Enter string:");
		String last = scnr.next();

		System.out.println(first + " " + second + " " + third + " " + last);
		System.out.println(last + " " + third + " " + second + " " + first);
		System.out.println(second + " cast to an integer is " + (int) second);
		scnr.close();
	}
}