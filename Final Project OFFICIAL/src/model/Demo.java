package Model;

import java.io.IOException;

import Utility.MasterCourseHelper;
import Utility.MiniCourseHelper;
import Utility.PersonHelper;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MiniCourseBag theMiniBag = new MiniCourseBag(3);
		theMiniBag.insert(new MiniCourse("CSE148",CourseType.TAKEN,CourseGrade.A));
		PersonBag theBag = new PersonBag(10);
		theBag.insert(new Student("Don", "Mal", "6316818097",Major.CSE, theMiniBag));
		theBag.insert(new Faculty("Kal", "Kigye", "634818097",Title.ASSISTANT_PROFFESSOR, 20000.0));
		theBag.insert(new Student("Mike", "Walle", "631685097",Major.PSY, theMiniBag));
		theBag.insert(new Student("Dee", "Maluna", "631658097",Major.CSE, theMiniBag));
		PersonHelper.exportData(theBag);
		System.out.println("lol");
		

	}
}
