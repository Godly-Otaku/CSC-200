package Zybook;

import java.util.Scanner;

public class ExactChange3_25 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      int amt = s.nextInt();
      
      int initdol = (int) amt / 100;
      int initpen = (int) amt / 1;
      
      int afterdol = amt - (100 * initdol);
      int dolquar = afterdol / 25;
      //dollars ^
      int afterdolquar = afterdol - (25 * dolquar);
      int quardime = afterdolquar / 10;
      //quarters ^
      int afterquardime = afterdolquar - (10 * quardime);
      int dimenick = afterquardime / 5;
      //dimes ^
      int afterdimenick = afterquardime - (5 * dimenick);
      int nickpen = afterdimenick / 1;
      //nickels ^

      if (initdol >= 1) {
            String plurdol = (initdol > 1) ? " Dollars" : " Dollar";
            System.out.println(initdol + plurdol);
      }
      if (afterdol >= 1) {
            String plurquar = (dolquar > 1) ? " Quarters" : " Quarter";
            System.out.println(dolquar + plurquar);
      }
      if (quardime >= 1) {
            String plurdime = (quardime > 1) ? " Dimes" : " Dime";
            System.out.println(quardime + plurdime);
      }
      if (dimenick >= 1) {
            String plurnick = (dimenick > 1) ? " Nickels" : " Nickel";
            System.out.println(dimenick + plurnick);
      }
      if (nickpen >= 1) {
            String plurpen = (nickpen > 1) ? " Pennies" : " Penny";
            System.out.println(nickpen + plurpen);
      }
      if (initpen < 1) {
            System.out.println("No change");
      }
      s.close();
   }
}