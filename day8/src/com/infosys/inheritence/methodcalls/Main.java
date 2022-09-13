package com.infosys.inheritence.methodcalls;

public class Main {

	public static void main(String[] args) {
	Child child=new Child();
	child.displayParent();
	child.displayChild();
	child.display();// iamdisplay
	// The child display method is
	// called and it is overriding the
	// display in the parent class
	}

}
