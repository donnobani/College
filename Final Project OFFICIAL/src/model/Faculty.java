package Model;

public class Faculty extends Person{
	private Title title;
	private double salary;
	
	public Faculty(String firstName, String lastName, String phoneNumber, Title title, double salary) {
		super(firstName, lastName, phoneNumber);
		this.title = title; //  NEEDS DATA VADILITY
		this.salary = salary;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title; //  NEEDS DATA VADILITY
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.getFirstName()+" "+super.getLastName()+" "+super.getPhoneNumber()+
				" "+title+" "+salary+" ";
	}
	
	
	
	
	

}
