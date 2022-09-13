package com.infosys.inheritence.methodcalls3;
public class OnlineExam extends Exam {
   public void test(){
    //test(); // recursive method call
    super.test(); // We are invoking the test method of the super/parent class
    System.out.println("Writing online exams");
   }
 }
 
  