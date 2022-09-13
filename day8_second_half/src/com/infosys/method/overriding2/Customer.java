package com.infosys.method.overriding2;
public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	public Customer(String customerId, String customerName, long contactNumber,
			Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public double payBill(double totalPrice) {
		System.out.println("I am the paybill method of base class Customer");
		System.out.println("Final bill for the customer is calculated here");
		
		return totalPrice;
	}
	// displayCustomerDetails()
	// updateDetails() overloaded methods
	// getter and setter methods
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
