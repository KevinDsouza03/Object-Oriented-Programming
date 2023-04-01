
public class Staff extends UEmployee{
	//Once again, we are "extending" the public attributes from UEmployee
	//to our current class, Staff. 
	
	//Members
	private String jobTitle;
	
	//Constructors
	
	public Staff() { //default
		super();
		jobTitle = "No Job";
	}
	
	//Parameterized constructor
	
	public Staff(String jT, String N, double Sal) {
		super(N,Sal); //The same as in Faculty class, where we call the parameterized constructor from the superclass
		setJobTitle(jT);
	}
	
	//Accessors
	
	public String getJobTitle() {return jobTitle;}
	
	//Mutators
	
	public void setJobTitle(String jT) {jobTitle = jT;}
}
