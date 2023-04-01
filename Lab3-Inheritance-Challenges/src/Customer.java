
public class Customer extends Person{
	//By inheriting/extending from person, a Customer is a Person
	//therefore, we will soon be able to use public attributes
	
	//Members
	private String customerNumber; // Same logic as ContactNumber, just a lookup
	private boolean mailingList;
	
	//Accessors
	public String getCustomerNumber() {return customerNumber;}
	
	public boolean getMailingList() {return mailingList;}
	
	//Mutators
	public void setCustomerNumber(String cN) {customerNumber = cN;}
	
	public void setMailingList(boolean mL) {mailingList = mL;}
	
	//Constructors
	
	public Customer() {
		//Default
		super(); // calling the superclasses default constructor "Persons"
		this.setCustomerNumber("-1");
		this.setMailingList(false);
	}
	
	//Parameterized Constructor
	public Customer(String fN, String lN, String aD, String cN,String custNum,boolean mL)  {
		super(fN,lN,aD,cN); 
		//Calling the parameterized constructor for our person superclass, so we have to pass all of PERSONS 
		//necessary constructor params.
		this.setCustomerNumber(custNum);
		this.setMailingList(mL);
	}


}
