package Model;

public class MiniCourse {
	private String courseNumber;
	private CourseType courseType;
	private CourseGrade courseGrade;

	public MiniCourse(String courseNumber, CourseType courseType, CourseGrade courseGrade) {
		super();
		this.courseNumber = courseNumber;
		this.courseType = courseType; // NEEDS EXCEPTION HANDELING
		this.courseGrade = courseGrade; // NEEDS EXCEPTION HANDELING
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public CourseGrade getCourseGrade() {
		return courseGrade;
	}

	public void setCourseGrade(CourseGrade courseGrade) {
		this.courseGrade = courseGrade;
	}

	@Override
	public String toString() {
		return courseNumber+" "+courseType+" "+courseGrade;
	}

}
