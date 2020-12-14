package Zybook;

import java.util.Scanner;

public class DrivingCost2_26 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double brehValue = scnr.nextDouble();
      double bruhValue = scnr.nextDouble();
      
      double yourValue = (20 / brehValue) * bruhValue;
      double yourrValue = (75 / brehValue) * bruhValue;
      double yourrrValue = (500 / brehValue) * bruhValue;

      System.out.printf("%.2f %.2f %.2f\n", yourValue, yourrValue, yourrrValue);
      scnr.close();
   }
}