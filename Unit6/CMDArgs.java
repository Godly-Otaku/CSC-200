package Unit6;

public class CMDArgs {
	public static void main(String[] args) {
		if (args.length == 0) {
			int[] arr = new int[10];
			for (int i = 0; i <= arr.length - 1; i++) {
				arr[i] = (int) (Math.random() * 100) + 1;
			}
			printArray(arr);
		} else if (args.length == 3) {
			int size = Integer.parseInt(args[0]);
			int bottom = Integer.parseInt(args[1]);
			int top = Integer.parseInt(args[2]);
			int[] arr = createArray(size, bottom, top);
			printArray(arr);
		} else {
			System.out.println("Please provide 0 or 3 arguments");
		}
	}

	public static int[] createArray(int size, int bottom, int top) {
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = (int) (Math.random() * (top - bottom + 1) + bottom);
			System.out.println(values[i]);
		}
		return values;
	}

	public static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}