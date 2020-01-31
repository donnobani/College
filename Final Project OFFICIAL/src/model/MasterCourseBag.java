package Model;

public class MasterCourseBag{
	private Course[] courses;
	private int nElems;

	public MasterCourseBag(int maxSize) {
		courses = new Course[maxSize];
		nElems = 0;
	}
	

	public Course find(String courseNumber) {
		for (int i = 0; i < nElems; i++) {
			if (courses[i].getCourseNumber().equals(courseNumber)) {
				return courses[i];
			}
		}
		return null;
	}

	public Course[] getCourseArray() {
		return courses;
	}

	public Course remove(String courseNumber) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (courses[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Course temp = courses[i];
			for (int j = i; j < nElems - 1; i++) {
				courses[j] = courses[j + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public void insert(Course course) {
		courses[nElems++] = course;
	}
	
	public void display() {
		for(int i = 0; i<nElems; i++) {
			System.out.println(courses[i]);
		}
		System.out.println();
	}
	
	public double getNElems() {
		return nElems;
	}

}
