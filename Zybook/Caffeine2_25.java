package Zybook;

import java.util.Scanner;

public class Caffeine2_25 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      
      double caffeineMg = scnr.nextDouble(); 
      double yourValue = caffeineMg / 2;
      double yourrValue = yourValue / 2;
      double yourrrValue = yourrValue / 4;
      System.out.printf("After 6 hours: %.2f mg\n", yourValue);
      System.out.printf("After 12 hours: %.2f mg\n", yourrValue);
      System.out.printf("After 24 hours: %.2f mg\n", yourrrValue);
      scnr.close();
   }
}