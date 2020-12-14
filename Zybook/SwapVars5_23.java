package Zybook;
import java.util.Scanner;

public class SwapVars5_23 {

	public static void swapValues(int[] values) {
		values[0] = values[0] + values[1];
	    values[1] = values[0] - values[1];
	    values[0] = values[0] - values[1];
		System.out.println(values[0] + " " + values[1]);
	}
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		
		int x = scnr.nextInt();
		int y = scnr.nextInt();
		int[] input = {x, y};
		swapValues(input);
		scnr.close();
	}
}