package Unit8;

import java.util.Arrays;

public class Circle {
	private double radius;
	private String color;

	public Circle(String c, double r) {
		radius = r;
		color = c;
	}

	public Circle(double r) { // user defined constructor, default is gone
		radius = r;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	// operation/behavior
	public void setColor(String newColor) {
		String[] validColors = { "red", "orange", "yellow", "green", "blue", "purple" };
		if (Arrays.asList(validColors).contains(newColor)) {
			color = newColor;
		} else {
			int ranColor = (int) (Math.random() * validColors.length);
			color = validColors[ranColor];
		}
	}

	public void display() {
		System.out.println("Radius: " + radius + "\nColor: " + color);
		System.out.println("-------------------");
	}
}