package com.kodytechnolab;

class Parent {

	static void ABC() {
		System.out.println("ABC");
	}
    static
	{
		System.out.println("Static Block");
	}
	void add()
	{
		System.out.println("Parent");
	}
}

public class Inheritance extends Parent {
	static void ABC() {
		System.out.println("Child                                                       method");
	}

	void add()
	{
		super.add();
		System.out.println("Child");
	}
	public static void main(String[] args) {

		Inheritance i1 = new Inheritance();
		
		i1.ABC();
		
		i1.add();
		
		

	}
}
