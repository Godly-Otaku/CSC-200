package Zybook;

import java.util.Scanner;

public class HTMLTable4_27 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int colunm = scnr.nextInt();
		int row = scnr.nextInt();
		System.out.println("<table>");
		for (int side1 = 1; side1 <= colunm; side1++) {
			System.out.print("<tr>");
			for (int side2 = 1; side2 <= row; side2++) {
				System.out.print(" <td> c </td>");
			}
			System.out.print(" </tr>");
			System.out.println();
		}
		System.out.println("</table>");
		scnr.close();
	}
}