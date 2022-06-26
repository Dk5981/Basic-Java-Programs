package com.kodytechnolab.basicjava;

/**
 * Objective : Developer : Divyesh Date : 08-Jun-2022 Time : 11:53:58 AM
 */
public class TestThrow {

	public static void validate(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String[] args) {

		validate(20);
		System.out.println("rest of the code...");
	}
}
