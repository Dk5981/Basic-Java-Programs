/**
 * 
 */
package com.kodytechnolab.basicjava;

/**
 * Objective : Developer : Divyesh Date : 09-Jun-2022 Time : 8:49:40 AM
 */
public class MethNestTry {

	public void nestedTryImplicit(int a) {
		try {
			if (a == 1)
				a = a / (a - a);
			if (a == 2) {
				int c[] = { 5 };
				c[1] = 10;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBound :: " + e);
		}

	}

	public static void main(String[] args) {

		try {
			int a = args.length;

			int b = 30 / a;

			MethNestTry obj = new MethNestTry();
			obj.nestedTryImplicit(a);
		} catch (ArithmeticException e) {
			System.out.println("Exception occured :: " + e);
		}
	}
}