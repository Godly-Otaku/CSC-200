package Zybook;

public class FoodItem8_9 {
	private String name;
	private double fat;
	private double carbs;
	private double protein;

	public FoodItem8_9() {
		name = "None";
	}

	public FoodItem8_9(String itemName, double amountFat, double amountCarbs, double amountProtein) {
		name = itemName;
		fat = amountFat;
		carbs = amountCarbs;
		protein = amountProtein;
	}

	public String getName() {
		return name;
	}

	public double getFat() {
		return fat;
	}

	public double getCarbs() {
		return carbs;
	}

	public double getProtein() {
		return protein;
	}

	public double getCalories(double numServings) {
		// Calorie formula
		double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
		return calories;
	}

	public void printInfo() {
		System.out.println("Nutritional information per serving of " + name + ":");
		System.out.printf("   Fat: %.2f g\n", fat);
		System.out.printf("   Carbohydrates: %.2f g\n", carbs);
		System.out.printf("   Protein: %.2f g\n", protein);
	}
}