package Model;

public class Course {
	private String courseTitle;
	private String courseNumber; // UNIQUE
	private String textbookISBN;
	private int credits; // weight

	public Course(String courseTitle, String courseNumber, String textbookISBN, int credits) {
		super();
		this.courseTitle = courseTitle;
		this.courseNumber = courseNumber;
		this.textbookISBN = textbookISBN;
		this.credits = credits;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getTextbookISBN() {
		return textbookISBN;
	}

	public void setTextbookISBN(String textbookISBN) {
		this.textbookISBN = textbookISBN;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return courseTitle+" "+courseNumber+" "+ textbookISBN+" "+credits;

	}
}
