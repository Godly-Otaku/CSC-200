package Zybook;

import java.util.Scanner;

public class SimpleStats2_30 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		int d = scnr.nextInt();

		int intprod = a * b * c * d;
		int intavg = (int) (a + b + c + d) / 4;
		
		double prod1 = (double) a * b;
		double prod2 = (double) c * d;
		double prod = (double) prod1 * prod2;
		double avg = (double) (a + b + c + d) / 4;
		
      System.out.println(intprod + " " + intavg);
      System.out.printf("%.3f %.3f\n", prod, avg);
	  /* Type your code here. */
	  scnr.close();
   }
}