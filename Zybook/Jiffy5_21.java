package Zybook;
import java.util.Scanner;

public class Jiffy5_21 {

	public static double secondsToJiffies(double userSeconds) {
		return userSeconds * 100;
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		double input = scnr.nextDouble();
		System.out.printf("%.2f", secondsToJiffies(input));
		scnr.close();
	}
}