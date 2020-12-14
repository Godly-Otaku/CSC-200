package Zybook;

import java.util.Scanner;

public class WhileModAvg4_21 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input = scnr.nextInt();
      int c = 0;
      float sum = 0;
      int valid = 0;
      int invalid = 0;
      
      while (input!=0) {
         if ((input >= 2) && (input <=12)) {
            valid++;
            c++;
            sum += input;
         } else {
            invalid++;
         }

         input = scnr.nextInt();
      }
      if (c == 0) {
         System.out.println("Average: 0.0");
      } else {
         System.out.println("Average: " + (sum/c));
      }
      System.out.println("Valid: " + valid);
      System.out.println("Invalid: " + invalid);
      scnr.close();
   }
}
