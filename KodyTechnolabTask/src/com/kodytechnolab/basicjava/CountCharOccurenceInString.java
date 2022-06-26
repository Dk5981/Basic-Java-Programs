package com.kodytechnolab.basicjava;

import java.util.Scanner;

/**
 * Objective : Java Program to count the occurrence of the given character in a
 * string 
 * Developer : Divyesh 
 * Date : 08-Jun-2022 
 * Time : 5:55:11 AM
 */
public class CountCharOccurenceInString {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		/* Taking input from the user. */
		System.out.println("Enter the String :: ");
		String string = sc.nextLine();

		System.out.println("Enter the Character to show Occurence :: ");
		char ch = sc.next().charAt(0);

		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (ch == string.charAt(i)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Please Enter Character from String.");
		} else {
			System.out.println("Character " + ch + "--->" + count);
		}
	}
}