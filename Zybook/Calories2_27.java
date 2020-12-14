package Zybook;

import java.util.Scanner;

public class Calories2_27 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double age = scnr.nextInt();
      double weight = scnr.nextInt();
      double hRate = scnr.nextInt();
      double time = scnr.nextInt();
      
      double womenCal = ((age * 0.074) - (weight * 0.05741) + (hRate * 0.4472) - 20.4022 ) * time / 4.184;
      double menCal = ((age * 0.2017) + (weight * 0.09036) + (hRate * 0.6309) - 55.0969 ) * time / 4.184;
      System.out.printf("Women: %.2f calories\n", womenCal);
      System.out.printf("Men: %.2f calories\n", menCal);
      scnr.close();
   }
}