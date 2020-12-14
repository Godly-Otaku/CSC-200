package Zybook;
import java.util.Scanner;

public class LeapYearM5_24 {

	public static boolean isLeapYear(int inputYear) {
			if (inputYear % 4 == 0) {
				if ((inputYear % 100 == 00) && (inputYear % 400 == 0)) {
				System.out.println(inputYear + " is a leap year.");
				return true;
				} else if ((inputYear % 100 == 00) && (inputYear % 400 != 0)){
					System.out.println(inputYear + " is not a leap year.");
					return false;
				} else {
				System.out.println(inputYear + " is a leap year.");
				return true;
				}
		} else {
				System.out.println(inputYear + " is not a leap year.");
				return false;
		}
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		int input = scnr.nextInt();
		isLeapYear(input);
		scnr.close();
	}
}