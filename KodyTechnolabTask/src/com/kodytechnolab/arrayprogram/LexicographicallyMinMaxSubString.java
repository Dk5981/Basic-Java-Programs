package com.kodytechnolab.arrayprogram;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Objective : 
 * Developer : Divyesh
 * Date : Jun 15, 2022
 * Time : 4:34:33 PM
 */
public class LexicographicallyMinMaxSubString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = 0;

		/* Taking the input from the user. */
		System.out.println("Enter the String :: ");
		String string = sc.nextLine();

		try {
			System.out.println("Enter the size :: ");
			size = sc.nextInt();

			String subString[] = new String[string.length() - (size - 1)];

			int count = size;

			for (int i = 0; i < subString.length; i++) {
				subString[i] = string.substring(i, count);
				count++;
			}

			System.out.println("-----Partition of " + string + " with size " + size + "-----\n");
			for (int i = 0; i < subString.length; i++) {
				System.out.print("[" + subString[i] + "] \n");
			}
			/* Doing sort operation on array. */
			Arrays.sort(subString);

			System.out.println("\n----------Output----------\n");
			System.out.println("Smallest Substring ----->" + subString[0]);
			System.out.println("Largest Substring ------>" + subString[subString.length - 1]);
		} catch (InputMismatchException e) {
			System.out.println("Please enter size in digits only.....");
			System.exit(0);
		}
		sc.close();
	}
}