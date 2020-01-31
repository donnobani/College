package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Model.TextbookBag;

public class TextbookHelper {
	public static void save(TextbookBag theBag) throws IOException {
		FileOutputStream fos = new FileOutputStream("data/TextbookBag.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(theBag);
		oos.close();
	}
	
	public static TextbookBag load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("data/PersonBag.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TextbookBag theBag = (TextbookBag)ois.readObject();
		ois.close();
		return theBag;
	}
	
	public static void exportData() {
		
	}
	
	public static void importData(TextbookBag theBag,String titleFile, String isbnFile) throws FileNotFoundException { //WRITTEN BY BIN XING
		File fileForTitle = new File(titleFile);
		File fileForISBN = new File(isbnFile);
		Scanner titleScanner = new Scanner(fileForTitle);
		Scanner isbnScanner = new Scanner(fileForISBN);
		
		while(titleScanner.hasNextLine()) {
			String title = titleScanner.nextLine();
			String isbn = isbnScanner.nextLine();
			ArrayList<Name> authorList = NameFactory.emitNameLIST(1+(int)(Math.random()* 3)); //write in new NAMEfactory class
		}
		
	}

}
