package Unit3;

import java.util.Scanner;

public class Discussion3 {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		
	System.out.println("Enter an integer");
	int num = s.nextInt();
	if ((num > 366) || (num < 1)) {
		System.out.println("Please keep the number between 1 and 366");
		System.exit(0);
	}
	System.out.println("Is it a leap year?(Y/N)");
	String yesno = s.next();

	boolean leap = false;
	if ((yesno.equals("Yes")) || (yesno.equals("Y"))) leap = true;

	if (leap) {
		if ((num >= 1) && (num <= 31)) { //January
			System.out.println("Your day is: January " + num);
		}
		if ((num > 31) && (num <= 60)) {
			System.out.println("Your day is: February " + (num - 31));
		}
		if ((num > 60) && (num <= 91)) {
			System.out.println("Your day is: March " + (num - 60));
		}
		if ((num > 91) && (num <= 121)) {
			System.out.println("Your day is: April " + (num - 91));
		}
		if ((num > 121) && (num <= 152)) {
			System.out.println("Your day is: May " + (num - 121));
		}
		if ((num > 152) && (num <= 186)) {
			System.out.println("Your day is: June " + (num - 152));
		}
		if ((num > 182) && (num <= 213)) {
			System.out.println("Your day is: July " + (num - 182));
		}
		if ((num > 213) && (num <= 244)) {
			System.out.println("Your day is: August " + (num - 213));
		}
		if ((num > 244) && (num <= 274)) {
			System.out.println("Your day is: September " + (num - 244));
		}
		if ((num > 274) && (num <= 305)) {
			System.out.println("Your day is: October " + (num - 274));
		}
		if ((num > 305) && (num <= 335)) {
			System.out.println("Your day is: November " + (num - 305));
		}
		if ((num > 335) && (num <= 366)) {
			System.out.println("Your day is: December " + (num - 335));
		}
	} else { //Not a leap year
		if ((num >= 1) && (num <= 31)) {
			System.out.println("Your day is: January " + num);
		}
		if ((num > 31) && (num <= 59)) {
			System.out.println("Your day is: February " + (num - 31));
		}
		if ((num > 59) && (num <= 90)) {
			System.out.println("Your day is: March " + (num - 59));
		}
		if ((num > 90) && (num <= 120)) {
			System.out.println("Your day is: April " + (num - 90));
		}
		if ((num > 120) && (num <= 151)) {
			System.out.println("Your day is: May " + (num - 120));
		}
		if ((num > 151) && (num <= 181)) {
			System.out.println("Your day is: June " + (num - 151));
		}
		if ((num > 181) && (num <= 212)) {
			System.out.println("Your day is: July " + (num - 181));
		}
		if ((num > 212) && (num <= 243)) {
			System.out.println("Your day is: August " + (num - 212));
		}
		if ((num > 243) && (num <= 273)) {
			System.out.println("Your day is: September " + (num - 243));
		}
		if ((num > 273) && (num <= 304)) {
			System.out.println("Your day is: October " + (num - 273));
		}
		if ((num > 304) && (num <= 334)) {
			System.out.println("Your day is: November " + (num - 304));
		}
		if ((num > 334) && (num <= 365)) {
			System.out.println("Your day is: December " + (num - 334));
		}
	}
	s.close();
	}
}