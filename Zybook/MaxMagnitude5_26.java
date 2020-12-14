package Zybook;
import java.util.Scanner;

public class MaxMagnitude5_26 {

	public static int maxMagnitude(int num1, int num2) {
		int maxMag = 1;
		if (Math.abs(num1) > Math.abs(num2)) maxMag = num1;
		if (Math.abs(num2) > Math.abs(num1)) maxMag = num2;
		return maxMag;
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		System.out.println(maxMagnitude(a, b));
		scnr.close();
	}
}