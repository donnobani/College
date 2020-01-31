package Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import Model.CourseGrade;
import Model.CourseType;
import Model.Faculty;
import Model.MiniCourse;
import Model.MiniCourseBag;
import Model.Person;
import Model.PersonBag;
import Model.Student;

public class PersonHelper {
	public static void save(PersonBag theBag) throws IOException {
		FileOutputStream fos = new FileOutputStream("data/PersonBag.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(theBag);
		oos.close();
	}
	
	public static PersonBag load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("data/PersonBag.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		PersonBag theBag = (PersonBag)ois.readObject();
		ois.close();
		return theBag;
	}
	
	public static void exportData(PersonBag theBag) throws IOException {
		FileWriter fw = new FileWriter("data/PersonBagExport.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		Person[] arr = theBag.getPersonArray();
		for(int i = 0 ; i< theBag.getNElems();i++) {
			if(arr[i] instanceof Faculty) {
				pw.print(arr[i].toString()+"\n"); //toString formatted
			}
			
		}
		pw.print("alumni\n"); // separator.
		for(int i = 0; i<theBag.getNElems();i++) {
			if(arr[i] instanceof Student) {
				pw.print(arr[i].toString()+"\n"); //toString formatted
				//writing main info on one line and then minibag inside brackets
			}
		}
		pw.close();
	}
	
public static PersonBag importData() throws IOException {				//PASSED PROOF
		
		File f = new File("data/PersonBagExport.txt"); // NAME FILE THAT WITH DATA POOLS AS SUCH
		Scanner file = new Scanner(f);//wrapper
		BufferedReader reader = new BufferedReader(new FileReader("data/PersonBagExport.txt"));
		//
		int lines = 0;
		while (reader.readLine() != null) {
			lines++;
		}
		lines--; // for "alumni" separator
		reader.close();
		PersonBag theBag = new PersonBag(lines);
		String[] tokens = new String[3];
		for(int i = 0; i<lines; i++){
			tokens = file.nextLine().split(" "); //split by space	
			System.out.println(tokens[0]+" "+tokens[1]+" "+tokens[2]);
			theBag.insert(new MiniCourse(tokens[0],CourseType.valueOf(tokens[1]),CourseGrade.valueOf(tokens[2]))) ;
		}
		//
		
		
		return theBag;		

}
