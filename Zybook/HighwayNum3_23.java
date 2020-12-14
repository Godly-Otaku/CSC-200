package Zybook;

import java.util.Scanner;

public class HighwayNum3_23 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();
      
      if ((highwayNumber < 1) || (highwayNumber > 999)) {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
      if ((highwayNumber < 100) && (highwayNumber > 1) && (highwayNumber % 2 == 0)) {
         System.out.println("I-" + highwayNumber + " is primary, going east/west.");
      } if ((highwayNumber < 100) && (highwayNumber > 1) && (highwayNumber % 2 != 0)) {
         System.out.println("I-" + highwayNumber + " is primary, going north/south.");
      } if ((highwayNumber > 100) && (highwayNumber < 999) && (highwayNumber % 2 == 0)) {
         primaryNumber = (highwayNumber % 100);
         System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
      } if ((highwayNumber > 100) && (highwayNumber < 999) && (highwayNumber % 2 != 0)) {
         primaryNumber = (highwayNumber % 100);
         System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
      }
      scnr.close();
   }
}