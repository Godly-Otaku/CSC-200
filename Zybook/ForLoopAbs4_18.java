package Zybook;

import java.util.Scanner;

public class ForLoopAbs4_18 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
   
      System.out.println("Enter an integer:");
      int input = scnr.nextInt();
      int n = Math.abs(input);
      int neg = n - (n * 2);
      System.out.print("Sequence: ");
      
      for (int i = neg; i <= n; i++) {
        System.out.print(i + " ");
      }
      System.out.print("\n");
      scnr.close();
   }
}