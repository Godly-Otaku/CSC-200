package Unit3;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		
	System.out.println("Enter the first integer: ");
	int a = s.nextInt();
	System.out.println("Enter the second integer: ");
	int b = s.nextInt();
	System.out.println("Enter the third integer: ");
	int c = s.nextInt();

	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
		
	if (a>max) {
		max = a;
	} 
	if (b>max) {
		max = b;
	} 
	if (c>max) {
		max = c;
	}
	if (a<min) {
		min = a;
	} if (b<min) {
		min = b;
	} if (c<min) {
		min = c;
	}
	int sum = a + b + c;
	int prod = a * b * c;
	int avg = (int) sum / 3;

	System.out.println("\nFor the numbers " + a + ", " + b + ", and " + c);
	System.out.println("Largest is " + max);
	System.out.println("Smallest is " + min);
	System.out.println("Sum is " + sum);
	System.out.println("Product is " + prod);
	System.out.println("Average is " + avg);
	s.close();
	}
}