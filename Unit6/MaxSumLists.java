package Unit6;

import java.util.*;

public class MaxSumLists {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();
		System.out.println("Enter values to add to your list.\nTo stop, enter 0");
		int value = scnr.nextInt();
		values.add(value);
		while (value != 0) {
			value = scnr.nextInt();
			values.add(value);
		}
		System.out.println("Max: " + max(values));
		System.out.println("Sum: " + sum(values));
		scnr.close();
	}

	public static Integer max(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i))
				max = list.get(i);
		}
		return max;
	}

	public static Integer sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}
}