package com.infosys.method.runtime.polymorphism;

public class Child extends Parent {
	public void childDisplay() {
		System.out.println("I am the method which is available in the Child class");
	}
	
	public void display() {
		System.out.println("I am the overriding display method");
	}
}
