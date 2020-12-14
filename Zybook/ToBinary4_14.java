package Zybook;

import java.util.Scanner;

public class ToBinary4_14 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int x = scnr.nextInt();
      
      while (x > 0) {
            System.out.print(x % 2);
            x /= 2;
      } System.out.print("\n");
      scnr.close();
      /* This is actually binary, above code is reversed
      String output = "";

      while (x > 0) {
            output = ((x % 2) == 0 ? "0" : "1") + output;
            x /= 2;
      } System.out.print(output);*/
   }
}