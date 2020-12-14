package Zybook;

import java.util.Scanner;

public class TriangleArea8_8 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Triangle8_8 t1 = new Triangle8_8();
		Triangle8_8 t2 = new Triangle8_8();

		double t1base = scnr.nextDouble();
		double t1height = scnr.nextDouble();
		double t2base = scnr.nextDouble();
		double t2height = scnr.nextDouble();

		t1.setBase(t1base);
		t1.setHeight(t1height);

		t2.setBase(t2base);
		t2.setHeight(t2height);
		double t1area = t1.getArea();
		double t2area = t2.getArea();

		System.out.println("Triangle with larger area:");
		if (t1area > t2area) {
			t1.printInfo();
		} else {
			t2.printInfo();
		}
		scnr.close();
	}
}
