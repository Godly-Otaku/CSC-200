package Zybook;

import java.util.Scanner;

public class SmallestNum3_22 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();

      
      if ((a < b) && (a < c)) {
         System.out.println(a);
      } else if ((b < a) && (b < c)) {
         System.out.println(b);
      } else if ((c < a) && (c < b)) {
         System.out.println(c);
      } else {
         System.out.println(a);
      }
      scnr.close();
   }
}