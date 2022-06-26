package com.kodytechnolab.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
	int rollno;
	String name;
	String clgname;

	public Student(int rollno, String name, String clgname) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.clgname = clgname;
	}

	public static void main(String[] args) {
		
//		Student abc = null;
						
		Set<Student> studentSet = new HashSet<Student>();

		Set<String> studentNames = new HashSet<>();
		
//		List<Student> list = new ArrayList<Student>();
//
//		list.add(abc);
		
		Student panshul = new Student(1, "Panshul", "KS");
		Student ankur = new Student(2, "Ankur", "KS");
		Student nikhar = new Student(3, "Nikhar", "KS");
		Student dhruv = new Student(4, "Dhruv", "KS");
		Student divyesh = new Student(5, "Divyesh", "KS");
		divyesh = panshul;

		// System.out.println(divyesh.hashCode());

		studentSet.add(panshul);
		studentSet.add(ankur);
		studentSet.add(nikhar);
		studentSet.add(dhruv);
		studentSet.add(divyesh);

		studentNames.add("Panshul");
		studentNames.add("Ankur");
		studentNames.add("Nikhar");
		studentNames.add(new String("Panshul"));

		System.out.println(studentSet.size());

		System.out.println(studentNames.size());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return (int) (Math.random() * 100000);
		return this.name.length();
	}

	@Override
	public boolean equals(Object obj) {
		return this.clgname.equals(((Student) obj).name);
	}
}