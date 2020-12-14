package Zybook;

import java.util.Scanner;

public class PaintWall2_35 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter wall height (feet):");
		double height = scnr.nextDouble();
		System.out.println("Enter wall width (feet):");
		double width = scnr.nextDouble();
		double area = height * width;
		System.out.println("Wall area: " + area + " square feet");
		double volume = area / 350;
		System.out.println("Paint needed: " + volume + " gallons");
		int cans = (int) Math.ceil(volume);
		System.out.println("Cans needed: " + cans + " can(s)");
		scnr.close();
	}
}