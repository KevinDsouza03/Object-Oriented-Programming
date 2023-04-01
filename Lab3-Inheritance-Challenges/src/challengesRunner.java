
public class challengesRunner {

	public static void main(String[] args) {
		Customer temp = new Customer();
		System.out.println("This is our default customer: " + temp.getFirstName() + " " + temp.getLastName() 
			+ " " + temp.getAddress() + " " + temp.getContactNumber() + " " + temp.getCustomerNumber() + " " + 
			temp.getMailingList());

	
		temp = new Customer("Sarah","Wiles","2800 Victory Rd", "839-493-3928","001-12-9374",true);
		System.out.println("This is our new customer: " + temp.getFirstName() + " " + temp.getLastName() 
			+ " " + temp.getAddress() + " " + temp.getContactNumber() + " " + temp.getCustomerNumber() + " " + 
			temp.getMailingList());

		PreferredCustomer test = new PreferredCustomer();
		System.out.println("This is our default Preferred Customer: " + test.getFirstName() + " " + test.getLastName() 
		+ " " + test.getAddress() + " " + test.getContactNumber() + " " + test.getCustomerNumber() + " " + 
		test.getMailingList() + " " + test.getTotalSpent() + " " + test.getLevel());
	
		test = new PreferredCustomer("Sarah","Wiles","2800 Victory Rd", "839-493-3928","001-12-9374",true);
		System.out.println("This is our new Preferred Customer: " + test.getFirstName() + " " + test.getLastName() 
		+ " " + test.getAddress() + " " + test.getContactNumber() + " " + test.getCustomerNumber() + " " + 
		test.getMailingList() + " " + test.getTotalSpent() + " " + test.getLevel());
		
		
		System.out.println("Now Sarah will make a purchase.");
		test.makePurchase(542.1);
		System.out.println("Sarah after the purchase: " + test.getFirstName() + " " + test.getLastName() 
		+ " " + test.getAddress() + " " + test.getContactNumber() + " " + test.getCustomerNumber() + " " + 
		test.getMailingList() + " " + test.getTotalSpent() + " " + test.getLevel());
		
		System.out.println("Now Sarah will make another $500 purchase.");
		test.makePurchase(589.1);
		System.out.println("Sarah after the purchase: " + test.getFirstName() + " " + test.getLastName() 
		+ " " + test.getAddress() + " " + test.getContactNumber() + " " + test.getCustomerNumber() + " " + 
		test.getMailingList() + " " + test.getTotalSpent() + " " + test.getLevel());
		
		System.out.println("Now Sarah will make another $500 purchase.");
		test.makePurchase(518.4);
		System.out.println("Sarah after the purchase: " + test.getFirstName() + " " + test.getLastName() 
		+ " " + test.getAddress() + " " + test.getContactNumber() + " " + test.getCustomerNumber() + " " + 
		test.getMailingList() + " " + test.getTotalSpent() + " " + test.getLevel());
		
		System.out.println("Now Sarah will make another $500 purchase.");
		test.makePurchase(542.1);
		System.out.println("Sarah after the purchase: " + test.getFirstName() + " " + test.getLastName() 
		+ " " + test.getAddress() + " " + test.getContactNumber() + " " + test.getCustomerNumber() + " " + 
		test.getMailingList() + " " + test.getTotalSpent() + " " + test.getLevel());
	}
}
