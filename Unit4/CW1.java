package Unit4;

import java.util.Scanner;

public class CW1 {
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		
	System.out.println("Enter the first integer: ");
	int c = 1;
	System.out.println("N\tN*10\tN*100\tN*1000\n");

	while (c <= 5) {
		System.out.println(c + "\t" + (c * 10) + "\t" + (c*100) + "\t" + (c*1000));
		c++;
	}
	s.close();
	}
}