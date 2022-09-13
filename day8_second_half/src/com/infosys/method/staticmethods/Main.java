package com.infosys.method.staticmethods;

public class Main {

	public static void main(String[] args) {
		Parent parent=new Child();
		parent.display();// I am the static method in the Parent class
		// If the methods are static we cannot override the static
		// methods. The reason is static methods are not related to objects
		// so there invocation is also not dependent on the object/
		// The static methods are related to classes and that is the
		// reason it is calling the static method of the reference type
		// as reference are getting created during the compilation time.
		Parent.display();
		Child child=new Child();
		child.display();
		Child.display();
	}

}
