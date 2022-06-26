package com.kodytechnolab.basicjava;

import java.util.Scanner;

/**
 * Objective : Java Program to Check Entered String is palindrome or not.
 * Developer : Divyesh   
 * Date      : 08-Jun-2022
 * Time      : 5:51:27 AM
 */
public class PalindromeString {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking input from the user and store it to the line object. */
		System.out.println("Enter the String :: ");
		String line = sc.next();

		/* Convert string object to character array. */
		char ch[] = line.toCharArray();

		/* Stores the character in reverse order in character array. */
		for (int i = (line.length() - 1), j = 0; i >= 0; i--, j++) {
			ch[j] = line.charAt(i);
		}

		/* Convert character array into String Object. */
		String reverse = new String(ch);

		if (reverse.trim().equals(line)) {
			System.out.println(line + " is Palindrome.");
		} else {
			System.out.println(line + " is not Palindrome. ");
		}
		sc.close();
	}
}
