package Zybook;

import java.util.Scanner;

public class WhileLoopRocket4_19 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int h = 0; 
      int v0 = scnr.nextInt();
      int t = 0; 

      while (h >= 0) {
        System.out.println(t + " " + h);
        t++;
        h = (v0 * t) - (5 * (t*t));
      }
      scnr.close();
   }
}