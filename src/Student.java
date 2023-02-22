/***
 * @author dsouz
 * Student Object 
 */
public class Student {
	private String lastName;
	private String firstName;
	private double average;
	
	//Default Constructor
	public Student() {
		lastName = "Doe";
		firstName = "John";
		average = 0.0;	
		}
	
	//Paramaterized Constructor
	public Student(String FN, String LN) {
		lastName = LN;
		firstName = FN;
		average = 0.0;
	}
	
	//Accessor Methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getAverage() {
		return average;
	}
	
	//Mutators
	
	public void setAverage(double AV) {
		average = AV;
	}
	
}
