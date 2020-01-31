package Model;

public class College {
	private MasterCourseBag masterCourseBag;
	private PersonBag personBag;
	private TextbookBag textbookBag;
	
	public College(int maxCourse, int maxPerson, int maxBooks) {
		MasterCourseBag masterCourseBag = new MasterCourseBag(maxCourse);
		PersonBag personBag = new PersonBag(maxBooks);
		TextbookBag textbookBag = new TextbookBag(maxBooks);
	}

	public MasterCourseBag getMasterCourseBag() {
		return masterCourseBag;
	}

	public void setMasterCourseBag(MasterCourseBag masterCourseBag) {
		this.masterCourseBag = masterCourseBag;
	}

	public PersonBag getPersonBag() {
		return personBag;
	}

	public void setPersonBag(PersonBag personBag) {
		this.personBag = personBag;
	}

	public TextbookBag getTextbookBag() {
		return textbookBag;
	}

	public void setTextbookBag(TextbookBag textbookBag) {
		this.textbookBag = textbookBag;
	}
	
	
	

}
