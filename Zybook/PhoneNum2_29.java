package Zybook;

import java.util.Scanner;

public class PhoneNum2_29 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNum = scnr.nextLong();
      long area = phoneNum / 10000000;
      long midNum = (long) (phoneNum / 10000) % 1000;
      long lastNum = phoneNum % 10000;
      // Add more variables as needed
      System.out.println("(" + area + ") " + midNum + "-" + lastNum);
      /* Type your code here. */
      scnr.close();
   }
}