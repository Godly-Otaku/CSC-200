package Zybook;

import java.util.Scanner;

public class MathMethods2_28 {
	public static void main(String[] args){
	Scanner scnr = new Scanner(System.in);
      double x = scnr.nextDouble();
      double y = scnr.nextDouble();
      double z = scnr.nextDouble();

      double opOne = Math.pow(x, z);
      double opTwo = Math.pow(x, (Math.pow(y, z)));
      double opThree = Math.abs(y);
      double opFour = Math.sqrt(Math.pow(x * y, z));
      
      System.out.println(opOne + " " + opTwo + " " + opThree + " " + opFour);
      scnr.close();
   }
}