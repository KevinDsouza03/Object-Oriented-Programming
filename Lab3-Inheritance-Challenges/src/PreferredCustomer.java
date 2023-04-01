

public class PreferredCustomer extends Customer{
	//By extending from the Customer Class, we are
	//taking both public methods from Customer, 
	//and Person to be used into our new class
	
	//Members
	
	private double totalSpent;
	private String level;// String to represent different tiers

	//Accessors	
	public double getTotalSpent() {
		return totalSpent;
	}
	
	public String getLevel() {
		return level;
		}
	
	//Mutators
	public void setTotalSpent(double totalSpent) {
		this.totalSpent += totalSpent;
	}
	
	//Constructors
	
	public PreferredCustomer() {
		super();
		totalSpent = 0;
		level = "D";
	}
	
	public PreferredCustomer(String fN, String lN, String aD, String cN,String custNum,boolean mL) {
		super(fN,lN,aD,cN,custNum,mL); // We have to pass ALL of our prior variables for our superclass constructors
		// This is so we are able to properly inherit.
		totalSpent = 0;
		level = "D";
	}
	
	//Methods
	
	public void makePurchase(double value) {
		//value is the purchase made, now we have to update our
		//customer properly
		totalSpent += value;
		System.out.println("Your totalspent is: " + this.getTotalSpent());
		if (totalSpent >= 2000 && level != "S") {
			System.out.println("\tCongratulations! You are now a level S customer!");
			level = "S";}
		else if (totalSpent >= 1500 && level != "A") {
			System.out.println("\tCongratulations! You are now a level A customer!");
			level = "A";}
		else if (totalSpent >= 1000 && level != "B") {
			System.out.println("\tCongratulations! You are now a level B customer!");
			level = "B";}
		else if (totalSpent >= 500 && level != "C") {
			System.out.println("\tCongratulations! You are now a level C customer!");
			level = "C"; }
		//repeatedly checking on every purchase if our total allows us to give a discount!
		//Actual discounting is handled separately.
	}
	
}
