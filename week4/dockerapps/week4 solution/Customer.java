public class Customer {
	String name;

	Customer(String name) {
		this.name = name;
		// fill code

	}

	void displayCustomerName() {
		System.out.println(this.name);
		// fill code to display customer name
	}

	public static void main(String args[]) {
		Customer c = new Customer("VerizonUSer");
		c.displayCustomerName();
		// call function to display customer name
	}
}