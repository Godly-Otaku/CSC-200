package Unit5;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Which operator do you want to use?");
		String operation = scnr.next().toLowerCase();
		
		System.out.println("Enter your 2 numbers:");
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		
		if ((operation.equals("add")) || (operation.equals("+"))) System.out.println("Result = " + add(x,y));
		else if ((operation.equals("subtract")) || (operation.equals("-"))) System.out.println("Result = " + subtract(x,y));
		else if ((operation.equals("multiply")) || (operation.equals("*"))) System.out.println("Result = " + multiply(x,y));
		else if ((operation.equals("divide"))|| (operation.equals("/"))) System.out.println("Result = " + divide(x,y));
		else System.exit(0);
		scnr.close();
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static int divide(int a, int b) {
		return a / b;
	}
}