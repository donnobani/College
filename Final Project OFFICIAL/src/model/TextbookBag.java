package Model;

public class TextbookBag {
	private Textbook[] books;
	private int nElems;

	public TextbookBag(int maxSize) {
		books = new Textbook[maxSize];
		nElems = 0;
	}

	public Textbook find(String ISBN) {
		for (int i = 0; i < nElems; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		return null;
	}

	public Textbook[] getTextbooksArray() {
		return books;
	}

	public Textbook remove(String ISBN) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Textbook temp = books[i];
			for (int j = i; j < nElems - 1; i++) {
				books[j] = books[j + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public void insert(Textbook book) {
		books[nElems++] = book;
	}
	
	public void display() {
		for(int i = 0; i<nElems; i++) {
			System.out.println(books[i]);
		}
		System.out.println();
	}

}
