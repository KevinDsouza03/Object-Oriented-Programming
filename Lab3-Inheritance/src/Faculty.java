
public class Faculty extends UEmployee {
	//By extending/inheriting, we can use UEmployee methods as they are public.
	//In this case, this is getName() and getSalary()
	
	
	//Members
	private String departmentName;
	
	//Constructors
	
	public Faculty() {
		super(); //This calls the SUPERCLASS, or UEmployee's default constructor
		// This allows us to use its public attributes.
		departmentName = "Undefined";
	}
	
	//Parameterized Constructor
	
	public Faculty(String dN, String N, double Sal) {
		super(N,Sal); // This will call the parameterized constructor for our UEmployee superclass.
		// This will then allow us to later on, use the methods with our defined data.
		setDepartmentName(dN);
	}
	
	//Accessors
	public String getDepartmentName() {return departmentName;}
	
	//Mutators
	public void setDepartmentName(String dN) {departmentName = dN;}
	
	
	
}
