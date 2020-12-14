package Zybook;

import java.util.Scanner;

public class Arrow1_18 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int baseChar; 
      int headChar; 
      
      baseChar = scnr.nextInt();
      headChar = scnr.nextInt();
      
      System.out.println("     " + headChar);
      System.out.println("     " + headChar + headChar);
      System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar);
      System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar + headChar);
      System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar);
      System.out.println("     " + headChar + headChar);
      System.out.println("     " + headChar);
      scnr.close();
   }
}