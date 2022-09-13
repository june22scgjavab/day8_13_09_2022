package com.infosys.method.runtime.polymorphism;

public class Main {

	public static void main(String[] args) {
	Parent parent=new Parent();
	parent.parentDisplay();
	parent.display();
	Child child=new Child();
	child.parentDisplay();
	child.childDisplay();
	child.display(); // The display of the Child class
	// will be called
	Parent parent2=new Child();
	// The reference is of Parent type
	// Object is of child type.
	// Which are the methods of parent and child
	// can be called with the reference of Parent type
	parent2.parentDisplay();
	//parent2.childDisplay();
	// With the parent reference we cannot call a 
	// method which is present in the child but not in 
	// the parent class
	parent2.display();
	// The display of the Child will be called
	// as the object is of Child type
    // How can we call the method childDisplay ?
	// do typecasting
	Child child2=(Child)parent2;
	child2.childDisplay();
	}

}
