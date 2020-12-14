package Zybook;

import java.util.Scanner;
import java.util.Arrays;

public class Seasons3_24 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      String month = scnr.next();
      int day = scnr.nextInt();
      boolean normal = (day >= 1) && (day <= 31);
      boolean kinda = (day >= 1) && (day <= 30);
      boolean feb = (day >= 1) && (day <= 29);
      
      String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

      if (((month.equals("March")) && (day >= 20) && (day <= 31)) || ((month.equals("April")) && kinda) || ((month.equals("May")) && normal) || ((month.equals("June")) && (day <= 20) && (day >= 1)) && Arrays.asList(months).contains(month)) {
         System.out.println("Spring");
      } else if (((month.equals("June")) && (day >= 21) && (day <= 30)) || ((month.equals("July")) && normal)  || ((month.equals("August")) && normal)  || ((month.equals("September")) && (day <= 21) && (day >= 1)) && Arrays.asList(months).contains(month)) {
         System.out.println("Summer");
      } else if (((month.equals("September")) && (day >= 22) && (day <= 30)) || ((month.equals("October")) && normal)  || ((month.equals("November")) && kinda)  || ((month.equals("December")) && (day <= 20) && (day >= 1)) && Arrays.asList(months).contains(month)) {
         System.out.println("Autumn");
      } else  if (((month.equals("December")) && (day >= 21) && (day <= 31)) || ((month.equals("January")) && normal)  || ((month.equals("February")) && feb)  || ((month.equals("March")) && (day <= 19) && (day >= 1)) && Arrays.asList(months).contains(month)) {
         System.out.println("Winter");
      } else {
         System.out.println("Invalid");
      }
      scnr.close();
   }
}