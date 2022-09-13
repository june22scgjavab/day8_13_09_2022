package com.infosys.inheritence.methodcalls4;
public class Main{
   public static void main(String args[]){
    Calculator calc=new Calculator();
    System.out.println(calc.add(3,4));
    System.out.println(calc.add(3.2f,4.5f));
    System.out.println(calc.add(1,2,3));
    calc.add(1.2f,1,1.3f);
   // calc.add();// So during the compilation time it is 
    // checking whether we have add method without parameters
    // and if it is not found the code wont compile
   // This is the reason we call it as compile time polymorphism 

  }
}