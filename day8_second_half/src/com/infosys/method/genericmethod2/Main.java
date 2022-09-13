package com.infosys.method.genericmethod2;

public class Main {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Display.displayDetails(employee);
		employee=new Educator();
		Display.displayDetails(employee);
		employee=new Manager();
		
		Display.displayDetails(employee);
		
			

	}

}
