package com.kodytechnolab.basicjava;

import java.util.Scanner;

/**
 * Objective : Java Program to Check if two strings are anagrams of each other.
 * (String 1 = Army and String 2 = mary then it should return true) 
 * Developer : Divyesh
 * Date : 07-Jun-2022 
 * Time : 12:25:02 PM
 */
public class AnagramString {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter the String1 : ");
		String string1 = sc.nextLine();

		System.out.println("Enter the String2 : ");
		String string2 = sc.nextLine();

		/*count array to Stores 1's if character is found otherwise 0. */
		int count[] = new int[string1.length()];
		/*for check whether string is anagram or not.*/
		int f = 0;
		if (string1.length() == string2.length()) {
			for (int i = 0; i < string1.length(); i++) {
				
				/* if it founds character match it is increment by 1.*/
				int flag = 0;
				/* Stores character of string1. */
				char base = string1.charAt(i);
				for (int j = 0; j < string2.length(); j++) {
					/* Stores character of string2. */
					char sub = string2.charAt(j);
					if (((int) base - (int) sub == 32) || ((int) sub - (int) base == 32) || (sub == base)) {
						flag++;
						string2 = string2.replaceFirst(Character.toString(sub), " ");
						count[i] = flag;
						break;
					}
				}
			}

			for (int i = 0; i < count.length; i++) {
				if (count[i] == 1) {
					f = 1;
				} else {
					f = 0;
					break;
				}
			}

			if (f == 1) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		} else {
			System.out.println("Please Enter same length for both strings.");
		}
	}
}