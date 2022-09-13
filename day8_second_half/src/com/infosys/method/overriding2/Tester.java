package com.infosys.method.overriding2;
public class Tester {
	public static void main(String[] args) {
		// Customer object created
	/*	Customer customer = new Customer("C101", "Stephen Abram", 7856341287L,
	
				new Address("D089", "St. Louis Street", "Springfield"));
		// payBill() is invoked
		double amount = customer.payBill(40.0);
		System.out.println("Final bill amount is $" + (int) (amount * 100)/ 100.0);
	*/
		//Regular Customer object created
		/*RegularCustomer regularCustomer = new RegularCustomer("C101",
				"Stephen Abram", 7856341287L, new Address("D089",
						"St. Louis Street", "Springfield"));
		// payBill() is invoked
		double amount = regularCustomer.payBill(40.0);
		System.out.println("Final bill amount is $" + (int) (amount * 100)/ 100.0); */

		Customer regularCustomer = new RegularCustomer("C101", "Stephen Abram", 7856341287L, new Address("D089", "St. Louis Street", "Springfield"));
		double amount = regularCustomer.payBill(40.0);
		// payBill of the subclass is called
		// The above will be an example of runtime polymorphism
		// because here the object Of RegularCustomer is created
		// during the runtime ( which means when the code is executed).
		// So here during the runtime only it is decided which payBill
		// method will be called and it entirely depends on the object 
		// created . So in our example though the reference variable is
		// of Parent type ( Customer) but the object is of sub-class type
		// ( RegularCustomer). So it will call the payBill method of the
		// sub-class and not of the Parent type
		System.out.println(amount);

	
	}
}
