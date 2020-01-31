package Model;

public class PersonBag {
	private Person[] personArray;
	private int nElems;

	public PersonBag(int maxSize) {
		personArray = new Person[maxSize];
		nElems = 0;
	}

	public Person find(int id) {
		for (int i = 0; i < nElems; i++) {
			if (personArray[i].getId() == id ){
				return personArray[i];
			}
		}
		return null;
	}

	public Person[] getPersonArray() {
		return personArray;
	}
	
	public Person remove(int id) {
		int i = 0;
		for(i = 0; i < nElems; i++) {
			if(personArray[i].getId() == id ) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} else {
			Person temp = personArray[i];
			for(int j =i; j< nElems-1;j++) {
				personArray[j] = personArray[j+1];
			}
			nElems--;
			return temp;
		}
	}

	public void insert(MiniCourse miniCourse) {
		personArray[nElems++] = miniCourse;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(personArray[i]);
		}
		System.out.println();
	}

	public int getNElems() {
		return nElems;
	}
	
	
}