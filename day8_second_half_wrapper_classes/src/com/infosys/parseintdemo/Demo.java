package com.infosys.parseintdemo;

public class Demo {
// parseInt is a static method of Integer
// class which is converting from String to primitive data type int
	public static void main(String[] args) {
	   String str="123";
		//String str="a123"; // number in string representation
	// Exception in thread "main" java.lang.NumberFormatException: For input string: "a123"
	int num=Integer.parseInt(str);
	System.out.println(num);

	}

}
