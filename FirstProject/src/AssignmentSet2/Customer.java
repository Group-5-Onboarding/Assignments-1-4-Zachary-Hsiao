package AssignmentSet2;

public class Customer {
	public int customerId;
	public String customerName;
	public int contactNumber;
	public String address;
	
	public Customer(int customerId, String customerName, int contactNumber, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Address: " + address);
	}
}
