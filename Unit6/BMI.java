package Unit6;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("How many BMI would you like to calculate?");
		int num = scnr.nextInt();
		int[] height = new int[num];
		int[] weight = new int[num];
		double[] bmi = new double[num];
		for (int i = 0; i < num; i++) {
			System.out.println("------#" + (i + 1) + "------");
			System.out.println("What is the height? (cm)");
			int cm = scnr.nextInt();
			height[i] = cm;
			double meters = (double) cm / 100;
			meters *= meters;
			System.out.println("What is the weight? (kg)");
			int kgs = scnr.nextInt();
			weight[i] = kgs;
			double bmiCalc = ((double) kgs / meters);
			bmi[i] = bmiCalc;
		}
		printArray(bmi);
		scnr.close();
	}

	public static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("#" + (i + 1) + ": ");
			System.out.printf("%.2f%n", arr[i]);
		}
	}
}