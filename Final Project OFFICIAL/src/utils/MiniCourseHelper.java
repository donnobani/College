package Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import Model.Course;
import Model.CourseGrade;
import Model.CourseType;
import Model.MasterCourseBag;
import Model.MiniCourse;
import Model.MiniCourseBag;

public class MiniCourseHelper {
	public static void save(MiniCourseBag theBag) throws IOException {
		FileOutputStream fos = new FileOutputStream("data/MiniCourseBag.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(theBag);
		oos.close();
	}
	
	public static MiniCourseBag load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("data/MiniCourseBag.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MiniCourseBag theBag = (MiniCourseBag)ois.readObject();
		ois.close();
		return theBag;
	}
	
	public static void exportData(MiniCourseBag theBag) throws IOException {		//PASSED PROOF
		FileWriter fw = new FileWriter("data/MiniCourseBagExport.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		MiniCourse[] arr = theBag.getCourseArray();
		for(int i = 0 ; i< theBag.getNElems();i++) {
			pw.print(arr[i].toString()+"\n"); //toString formatted
		}
		pw.close();
	}
	
public static MiniCourseBag importData() throws IOException {				//PASSED PROOF
		
		File f = new File("data/MiniCourseBagImport.txt"); // NAME FILE THAT WITH DATA POOLS AS SUCH
		Scanner file = new Scanner(f);//wrapper
		BufferedReader reader = new BufferedReader(new FileReader("data/MiniCourseBagImport.txt"));
		int lines = 0;
		while (reader.readLine() != null) {
			lines++;
		}
		reader.close();
		MiniCourseBag theBag = new MiniCourseBag(lines);
		String[] tokens = new String[3];
		for(int i = 0; i<lines; i++){
			tokens = file.nextLine().split(" "); //split by space	
			System.out.println(tokens[0]+" "+tokens[1]+" "+tokens[2]);
			theBag.insert(new MiniCourse(tokens[0],CourseType.valueOf(tokens[1]),CourseGrade.valueOf(tokens[2]))) ;
		}
		
		
		return theBag;		
	}

	

}
