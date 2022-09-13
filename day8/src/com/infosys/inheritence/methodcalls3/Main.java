package com.infosys.inheritence.methodcalls3;
public class Main{
   public static void main(String args[]){
    OnlineExam exam=new OnlineExam();
    exam.test(); // So the method test() in the subclass will get priority and it will override the method test in the parent class
    // exam but after entering the test method of the subclass it will get super.test() and hence it will call the test method of
    // the parent class and control will again come back to the test method of the child class
   }
  }

