package com.infosys.method.overriding;

public class Child extends Parent {

	// We can protected modifier also but cannot have default and
	// private as they are restricted than protected
    public void display() {
	 System.out.println("Display");
 }
}
