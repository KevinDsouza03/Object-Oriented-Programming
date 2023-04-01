
public class UEmployeeRunner {

	public static void main(String[] args) {
		//Creating a UEmployee object
		UEmployee test = new UEmployee();
		System.out.println("This is our default UEmployee: "+ test.getName() + " " + test.getSalary());
		test = new UEmployee("Sarah",50000); // Using our parameterized constructor to make test a new object 
		System.out.println("This is our new UEmployee: " + test.getName() + " " + test.getSalary());
		Faculty temp = new Faculty();
		System.out.println("This is our default Faculty: " + temp.getName() + " " + temp.getSalary() + " " + temp.getDepartmentName());
		temp = new Faculty("IT", "Drake", 75000);// Parameterized
		System.out.println("This is our new Faculty: " + temp.getName() + " " + temp.getSalary() + " " + temp.getDepartmentName());
		Staff first = new Staff();
		System.out.println("This is our default Staff: " + first.getName() + " " + first.getSalary() + " " + first.getJobTitle());
		first = new Staff("Stuntman", "Rocky Road", 2000);
		System.out.println("This is our new Staff: " + first.getName() + " " + first.getSalary() + " " + first.getJobTitle());
	}

}
