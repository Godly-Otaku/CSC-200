package Zybook;

import java.util.Scanner;

public class NestedSum4_20 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num = scnr.nextInt();
      while (num > 0) {
        int sum = 0;
        for ( int i = 0; i < num; i++) {
            int nextNum = scnr.nextInt();
            if (nextNum > 0) {
                sum += nextNum;
            }
        }
        num = scnr.nextInt();
        System.out.println(sum);
      }
      scnr.close();
   }
}