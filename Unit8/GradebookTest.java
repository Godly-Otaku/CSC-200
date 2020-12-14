package Unit8;

public class GradebookTest {
	public static void main(String[] args) {
		Gradebook gb = new Gradebook("CS101 Introduction to Java Programming", "Sam Smith");
		gb.displayMessage();
		gb.setInstructor("Judy Jones");
		gb.displayMessage();
	}
}
