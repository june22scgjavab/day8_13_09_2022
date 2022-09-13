package com.infosys.inheritence.methodcalls4;
 public class Calculator{
 
   public int add(int a,int b){
    return a+b;
   }
 
 /* public void add(int a,int b){
   System.out.println(a+b);
  } */
 
  // Both the above methods can be kept in the single class because they differ only in the return type. But we 
  // dont consider only the return type for deciding method overloading
 public int add(int x,int y,int z){
    return x+y+z;
  }

  public float add(float a, float b){
    return a+b;
  }


  public void add(float a, float b, float c){
   System.out.println(a+b+c);
  }


 public float add(int a, float b){
    return a+b;
  }

 public float add(float a, int b){
    return a+b;
  }

 }


