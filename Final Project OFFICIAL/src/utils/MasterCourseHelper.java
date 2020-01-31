package utils;

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

import Model.Course;
import Model.MasterCourseBag;
import Model.PersonBag;
impoert model.


public class MasterCourseHelper {
	public static void save(MasterCourseBag theBag) throws IOException {
		FileOutputStream fos = new FileOutputStream("data/MasterCourseBag.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(theBag);
		oos.close();
	}
	
	public static MasterCourseBag load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("data/MasterCourseBag.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MasterCourseBag theBag = (MasterCourseBag)ois.readObject();
		ois.close();
		return theBag;
	}
	
	public static void exportData(MasterCourseBag theBag) throws IOException {		//PASSED PROOF
		FileWriter fw = new FileWriter("data/MasterCourseBagExport.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		Course[] arr = theBag.getCourseArray();
		for(int i = 0 ; i< theBag.getNElems();i++) {
			pw.print(arr[i].toString()+"\n"); //toString formatted
		}
		pw.close();
	}
	
	public static MasterCourseBag importData() throws IOException {				//PASSED PROOF
		
		File f = new File("data/MasterCourseBagImport.txt"); // NAME FILE THAT WITH DATA POOLS AS SUCH
		Scanner file = new Scanner(f);//wrapper
		System.out.println("hi");
		BufferedReader reader = new BufferedReader(new FileReader("data/MasterCourseBagImport.txt"));
		int lines = 0;
		while (reader.readLine() != null) {
			lines++;
		}
		reader.close();
	
		System.out.println("hi");
		MasterCourseBag theBag = new MasterCourseBag(lines);
		String[] tokens = new String[4];
		for(int i = 0; i<lines; i++){
			tokens = file.nextLine().split(" "); //split by space
			theBag.insert(new Course(tokens[0],tokens[1],tokens[2],Integer.parseInt(tokens[3]))) ;
		}
		file.close();
		
		return theBag;		
	}
	

}
