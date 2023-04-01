
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String contactNumber; //The phone number will be made a String
	//as we shouldn't be doing any mathematical operations onto a phone number
	// It is just a number to recite, and interpret elsewhere.

	//Accessor Methods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	//Mutator methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	//Constructors
	//Defaulted
	public Person() {
		this.setFirstName("John");
		this.setLastName("Doe");
		this.setAddress("Homeless");
		this.setContactNumber("911");
	}
	//Parameterized
	public Person(String fN, String lN, String aD, String cN) { 
		this.setFirstName(fN);
		this.setLastName(lN);
		this.setAddress(aD);
		this.setContactNumber(cN);
	}
	
	
}
