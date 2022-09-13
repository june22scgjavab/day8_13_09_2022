package com.infosys.wrapperdemo1;

public class Demo4 {

	public static void main(String[] args) {
	   char c='1';
		boolean b=Character.isDigit(c);
       System.out.println(b);  
       c='a';
       b=Character.isDigit(c);
       System.out.println(b);
       b=Character.isLetter(c);
	   System.out.println(b);
	   b=Character.isLetter('1');
	   System.out.println(b);
	}

}
