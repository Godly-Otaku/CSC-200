package Unit8;

public class Gradebook {
	private String coursename;
	private String instructor;

	public Gradebook(String course, String teacher) {
		coursename = course;
		instructor = teacher;
	}

	public void setCourseName(String name) {
		coursename = name;
	}

	public String getCourseName() {
		return coursename;
	}

	public void setInstructor(String instructorName) {
		instructor = instructorName;
		System.out.println("Changing instructor name to " + instructorName);
		System.out.println();
	}

	public String getInstructor() {
		return instructor;
	}

	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
		System.out.printf("This course is presented by: %s!\n\n", getInstructor());
	}
}
