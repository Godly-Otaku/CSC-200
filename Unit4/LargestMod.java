package Unit4;

import java.util.Scanner;

public class LargestMod {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		
	System.out.println("Many people are there: ");
	int n = s.nextInt();
	int c = 1;
	int max = Integer.MIN_VALUE;
		
	while (c <= n) {
		System.out.println("How many sales for this person?");
		int sales = s.nextInt();
		if (sales > max)
			max = sales;
		c++;
	}
	System.out.println("The highest amount of sales is " + max);
	s.close();
	}
}