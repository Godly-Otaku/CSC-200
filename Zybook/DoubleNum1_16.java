package Zybook;

import java.util.Scanner;

public class DoubleNum1_16 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.println("Enter x: ");
      int x = scnr.nextInt();

      System.out.println("x doubled is: " + (2 * x));
      scnr.close();
   }
}