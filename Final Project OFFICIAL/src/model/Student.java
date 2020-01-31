package Model;

public class Student extends Person {
	private Major major; 
	private MiniCourseBag miniBag;
	private double gpa;

	public Student(String firstName, String lastName, String phoneNumber, Major major, MiniCourseBag miniBag) {
		super(firstName, lastName, phoneNumber);
		this.major = major; //  NEEDS DATA VADILITY
		this.miniBag = miniBag;
		gpa = 0.0; // needs to be calculate through setter
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major; //  NEEDS DATA VADILITY
	}

	public MiniCourseBag getMiniBag() {
		return miniBag;
	}

	public void setMiniBag(MiniCourseBag miniBag) {
		this.miniBag = miniBag;
	}

	public double getGPA() {
		return gpa;
	}
	
	public void setGPA() {
		//CALCULATES GPA
	}

	@Override
	public String toString() {
		return super.getFirstName()+" "+super.getLastName()+" "+super.getPhoneNumber()+
				" "+major+" "+miniBag;
	}

}
