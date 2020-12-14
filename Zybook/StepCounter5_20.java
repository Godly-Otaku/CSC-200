package Zybook;
import java.util.Scanner;

public class StepCounter5_20 {

	public static double stepsToMiles(int userSteps) {
		return userSteps / 2000.00;
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		int input = scnr.nextInt();
		System.out.printf("%.2f", stepsToMiles(input));
		scnr.close();
	}
}