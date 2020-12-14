package Zybook;

import java.util.Scanner;

public class MusicFreq2_31 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double input = scnr.nextDouble();
		System.out.printf("%.2f ", input);
		System.out.printf("%.2f ", freqCalc(input, 1));
		System.out.printf("%.2f ", freqCalc(input, 2));
		System.out.printf("%.2f ", freqCalc(input, 3));
		System.out.printf("%.2f%n", freqCalc(input, 4));
		scnr.close();
	}

	public static double freqCalc(double input, int space) {
		double r = Math.pow(2, 0.08333333333333333333333333);
		return input * Math.pow(r, space);
	}
}