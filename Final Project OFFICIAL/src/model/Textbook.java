package Model;

import java.util.Arrays;

public class Textbook {
	private String title;
	private String[] author; // possible 1+ author
	private double price;
	private String ISBN; // VALIDITY CHECK???

	public Textbook(String title, String[] author, double price, String ISBN) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN; // VALIDITY CHECK??
	}

	@Override
	public String toString() {
		return "Textbook: " + title + " Author: " + Arrays.toString(author) + " Price: " + price + " ISBN:" + ISBN;
	}

}
