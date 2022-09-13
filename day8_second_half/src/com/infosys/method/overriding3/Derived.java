package com.infosys.method.overriding3;

public class Derived extends Base {
    @Override  // This is an annotation to convey to the compiler
    // That the method display is an overriding method.So the
    // advantage is compiler will check whether we have a method
    // of same signature in the Parent class
    // If it is not present, we will get compilation error
	public void display() {
		System.out.println("I am the overriding method");
	}
}
