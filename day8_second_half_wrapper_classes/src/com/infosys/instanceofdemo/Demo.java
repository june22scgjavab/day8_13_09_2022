package com.infosys.instanceofdemo;

class Base {}
class Derived extends Base{}

public class Demo {
// instanceof operator to check whatever we mentioned in 
	// the LHS is an object of whatever mentioned in the RHS
	public static void main(String[] args) {
		Base base=new Derived();
		boolean b1=base instanceof Base; // LHS is instanceof RHS
		System.out.println(b1);
		boolean b2=base instanceof Derived;
		System.out.println(b2);
		Base base2=new Base();
		boolean b3=base2 instanceof Base;
		System.out.println(b3);
		boolean b4=base2 instanceof Derived;
		System.out.println(b4);
		

	}

}
