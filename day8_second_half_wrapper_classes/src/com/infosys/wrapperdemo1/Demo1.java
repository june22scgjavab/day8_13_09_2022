package com.infosys.wrapperdemo1;
//import java.lang.Integer;
// lang package is imported by default. So we need not import
// the lang package for the classes within lang package
public class Demo1 {

	public static void main(String[] args) {
	Integer intObj=10;
	// intObje is a reference of Integer type 
	// which boxing ( enclosing ) the primitive 10
	// to an object representation.
	int num=intObj;
	// In line 10 we are converting the Integer
	// object to primitive int datatype
	Integer intObj1=new Integer(10); // We use to write this 
	// before the version 1.5
	// So initially we used to use the constructor of the Integer
	// class to initialise the Integer object.
	int num2=intObj1.intValue(); // So before java version 1.5
	// to convert object back to in , we used to invoke the intValue
	// method.
	
	}

}
