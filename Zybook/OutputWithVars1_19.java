package Zybook;

import java.util.Scanner;

public class OutputWithVars1_19 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.println("Enter integer:");
      int userNum = scnr.nextInt();  
      int numSqua = userNum * userNum;
      int numCube = userNum * userNum * userNum;
      System.out.println("You entered: " + userNum + "\n" + userNum + " squared is " + numSqua + "\nAnd " + userNum + " cubed is " + numCube + "!!");
      
      System.out.println("Enter another integer:");
      int otherNum = scnr.nextInt();
      int sum = userNum + otherNum;
      int prod = userNum * otherNum;
      System.out.println(userNum + " + " + otherNum + " is " + sum + "\n" + userNum + " * " + otherNum + " is " + prod);
      scnr.close();
   }
}