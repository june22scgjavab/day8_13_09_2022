package com.infosys.method.overriding2;
public class RegularCustomer extends Customer {
	private float discountPercentage;
	
	public RegularCustomer(String custId, String custName, long mobileNo,
			Address address) {
		super(custId, custName, mobileNo, address);
		this.discountPercentage = 5.0f;
	}
	@Override
	public double payBill(double totalPrice) {
		System.out.println("I am the sub-class method pay bill");
		double priceAfterDiscount = totalPrice
				* (1 - (discountPercentage / 100));
		return priceAfterDiscount;
	}
	// getter and setter methods
	public float getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(float discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}
