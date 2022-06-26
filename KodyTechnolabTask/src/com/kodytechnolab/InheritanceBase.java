package com.kodytechnolab;

/**
 * Objective : 
 * Developer : Divyesh Date : 03-Jun-2022 
 * Time : 11:18:27 AM
 */
class Base {
	int b = 1;
	
	public Base sum()
	{
		System.out.println("Hello");
		return null;
	}
}

class Sub extends Base {
	int a = 5;
	
	public Sub sum()
	{
		System.out.println("Child Hello");
		return this;
	}
	public void result()
	{
		
	}
}

class Sub2 extends Base {
	int c = 10;
}

public class InheritanceBase {

	public static void main(String[] args) {
		Base b = new Base();
		System.out.println(b);
		
		Sub s = new Sub();
		System.out.println(s);
		
		Base b1 = new Sub();
		b1.sum();
		
		b.sum();
		System.out.println(b);
		System.out.println(b.b);
		
	}
}
