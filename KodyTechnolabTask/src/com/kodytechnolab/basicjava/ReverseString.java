package com.kodytechnolab.basicjava;

import java.util.Scanner;

/**
 * Objective : Java Program to reverse a string without using any inbuilt function.
 * Developer : Divyesh 
 * Date : 08-Jun-2022 
 * Time : 5:32:52 AM
 */
public class ReverseString {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter the String :: ");
		String string = sc.nextLine();

		/* Convert String array into character array. */
		char[] charArray = string.toCharArray();

		/* reverse array which stores characters in reverse order. */
		char[] reverse = new char[string.length()];

		for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {
			reverse[j] = charArray[i];
		}

		/* Convert character array into String. */
		String reverseString = new String(reverse);

		System.out.println(reverseString);
	}
}