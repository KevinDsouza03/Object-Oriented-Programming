/***
 * Lab3 - Inheritance
 * @author dsouz
 *
 */
public class UEmployee {
	
	//Members
	private String name;
	private double salary;
	
	//Constructors
	
	public UEmployee() {
		name = "John Doe";
		salary = 0.0;
	}
	
	//Parameterized Constructor
	
	public UEmployee(String N, double Sal) {
		name = N;
		salary = Sal;
	}
	
	//Accessor Methods
	
	public String getName() {return name;}
	public double getSalary() {return salary;}
 }
