package Zybook;
import java.util.Scanner;

public class DrivingCostM5_22 {

	public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
		return (drivenMiles / milesPerGallon) * dollarsPerGallon;
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		double milesGallon = scnr.nextDouble();
		double dollarsGallon = scnr.nextDouble();
		System.out.printf("%.2f ", drivingCost(10, milesGallon, dollarsGallon));
		System.out.printf("%.2f ", drivingCost(50, milesGallon, dollarsGallon));
		System.out.printf("%.2f\n", drivingCost(400, milesGallon, dollarsGallon));
		scnr.close();
	}
}