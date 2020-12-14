package Zybook;

import java.util.Scanner;

public class NoGreyRGB3_21 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();
      
      if ((a < b) && (a < c)) {
         c = c - a;
         b = b - a;
         a = a - a;
         System.out.println(a + " " + b + " " + c);
      } else if ((b < a) && (b < c)) {
         c = c - b;
         a = a - b;
         b = b - b;
         System.out.println(a + " " + b + " " + c);
      } else if ((c < a) && (c < b)) {
         b = b - c;
         a = a - c;
         c = c - c;
         System.out.println(a + " " + b + " " + c);
      } else {
         b = b - b;
         a = a - a;
         c = c - c;
         System.out.println(a + " " + b + " " + c);
      }
      scnr.close();
   }
}