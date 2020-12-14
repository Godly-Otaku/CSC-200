package Zybook;
import java.util.Scanner;

public class MilesToLaps5_19 {

	public static double milesToLaps(double userMiles) {
		return userMiles * 4;
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		double input = scnr.nextDouble();
		System.out.printf("%.2f", milesToLaps(input));
		scnr.close();
	}
}