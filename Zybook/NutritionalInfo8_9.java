package Zybook;

import java.util.Scanner;

public class NutritionalInfo8_9 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		FoodItem8_9 foodItem1 = new FoodItem8_9();

		String itemName = scnr.next();
		double amountFat = scnr.nextDouble();
		double amountCarbs = scnr.nextDouble();
		double amountProtein = scnr.nextDouble();

		FoodItem8_9 foodItem2 = new FoodItem8_9(itemName, amountFat, amountCarbs, amountProtein);

		double numServings = scnr.nextDouble();

		foodItem1.printInfo();
		System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
				foodItem1.getCalories(numServings));

		System.out.println("\n");

		foodItem2.printInfo();
		System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
				foodItem2.getCalories(numServings));
		scnr.close();
	}
}