package Zybook;
import java.util.Scanner;

public class MaxMinM5_25 {

	public static int largestNumber(int num1, int num2, int num3) {
		int largest = 1;
		if ((num1 > num2) && (num1 > num3)) largest = num1;
		if ((num2 > num1) && (num2 > num3)) largest = num2;
		if ((num3 > num2) && (num3 > num1)) largest = num3;
		return largest;
	}
	public static int smallestNumber(int num1, int num2, int num3) {
		int smallest = 1;
		if ((num1 < num2) && (num1 < num3)) smallest = num1;
		if ((num2 < num1) && (num2 < num3)) smallest = num2;
		if ((num3 < num2) && (num3 < num1)) smallest = num3;
		return smallest;
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		System.out.println("largest: " + largestNumber(a, b, c));
		System.out.println("smallest: " + smallestNumber(a, b, c));
		scnr.close();
	}
}