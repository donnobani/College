package Model;

import java.util.Arrays;

public class MiniCourseBag{
	private MiniCourse[] courses;
	private int nElems;

	public MiniCourseBag(int maxSize) {
		courses = new MiniCourse[maxSize];
		nElems = 0;
	}

	public MiniCourse find(String courseNumber) { 
		for (int i = 0; i < nElems; i++) {
			if (courses[i].getCourseNumber().equals(courseNumber)) {
				return courses[i];
			}
		}
		return null;
	}

	public MiniCourse[] getCourseArray() {
		return courses;
	}

	public MiniCourse remove(String courseNumber) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (courses[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			MiniCourse temp = courses[i];
			for (int j = i; j < nElems - 1; i++) {
				courses[j] = courses[j + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public void insert(MiniCourse course) {
		courses[nElems++] = course;
	}
	
	public void display() {
		for(int i = 0; i<nElems; i++) {
			System.out.println(courses[i]);
		}
		System.out.println();
	}

	public int getNElems() {
		return nElems;
	}

	@Override
	public String toString() {
		return Arrays.toString(courses);
	}

	

	
	

}
