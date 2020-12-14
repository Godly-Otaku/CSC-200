package Unit4;

import java.util.Scanner;

public class Triangles {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		
	int size = 10;

		//1st triangle
		for (int length = 1; length <= size; length++){
			for (int width = 1; width <= length; width++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//2nd triangle
		for (int length = 1; length <= size; length++){
			for (int width = size; width >= length; width--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//3rd Triangle
		for (int length = 1; length <= size; length++){	
			for (int space = 0; space < length; space++) {
				System.out.print(" ");
			}
			for (int width = 0; width <= (size - length); width++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//4th Triangle
		for (int length = 1; length <= size; length++){	
			for (int space = 0; space <= (size - length); space++) {
				System.out.print(" ");
			}
			for (int width = 1; width <= length; width++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}
}