package com.infosys.method.genericmethod;

public class Display {

	public static void displayDetails(Employee employee)
	{
		employee.display();
	}
	
	public static void displayDetails(Educator educator)
	{
     educator.display();		
	}
	
	public static void displayDetails(Manager manager)
	{
     manager.display();		
	}
}
