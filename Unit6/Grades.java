package Unit6;

public class Grades {
	public static void main(String[] args) {

		int[] grades = new int[20];
		int total = 0;
		int highest = 0;
		for (int i = 0; i <= grades.length - 1; i++) {
			grades[i] = (int) (Math.random() * 100) + 1;
			total += grades[i];
			if (highest < grades[i]) {
				highest = grades[i];
			}
		}
		System.out.println("Average: " + (total / grades.length));
		System.out.println("Highest: " + highest);
	}
}