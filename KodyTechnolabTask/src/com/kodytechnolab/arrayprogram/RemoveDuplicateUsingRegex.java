package com.kodytechnolab.arrayprogram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Objective : RegEx to remove instances of words that are repeated more than
 * once, but retain the first occurrence of any case-insensitive repeated word.
 * For example, the words love and to are repeated in the sentence I love Love
 * to To tO code. Can you complete the code in the editor so it will turn I love
 * Love to To tO code into I love to code? 
 * Developer : Divyesh Date : Jun 14,2022 
 * Time : 4:08:56 PM
 */
public class RemoveDuplicateUsingRegex {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("How many sentence do you want :- ");

		int n = Integer.parseInt(sc.nextLine());

		String[] str = new String[n];
		System.out.println("Enter " + n + " sentense : ");

		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}

		String regex = "\\b(\\w+)(\\s+\\1\\b)+";

		for (int i = 0; i < str.length; i++) {
			Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(str[i]);

			while (m.find()) {
				str[i] = str[i].replaceAll(m.group(), m.group(1));
			}
			System.out.println(str[i]);
		}
	}
}