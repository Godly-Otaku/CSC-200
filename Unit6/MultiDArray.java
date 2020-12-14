package Unit6;

public class MultiDArray {

	public static void main(String[] args) {
		int a = 5, b = 5;
		int[][] grades = createArray(a, b);
		printArray(grades);
		largestRow(grades);
	}

	public static int[][] createArray(int row, int column) {
		int[][] values = new int[row][column];
		for (int i = 0; i <= values.length - 1; i++) {
			for (int j = 0; j <= values[i].length - 1; j++) {
				values[i][j] = (int) (Math.random() * 20) + 1;
			}
		}
		return values;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int x : arr[i]) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void largestRow(int[][] arr) {
		int[] sums = new int[arr.length];
		int max = Integer.MIN_VALUE;
		int row = 1;
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			for (int x : arr[i]) {
				sum += x;
			}
			sums[i] = sum;
			System.out.println("Row #" + (i + 1) + " sum: " + sum);
		}
		for (int index = 0; index <= sums.length - 1; index++) {
			if (sums[index] > max) {
				max = sums[index];
				row = index + 1;
			}
		}
		System.out.println("Largest sum: Row #" + row + ": " + max);
	}
}