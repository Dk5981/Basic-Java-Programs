package com.kodytechnolab;

import java.util.Scanner;

/**
 * 
 * Objective : This Program prints factorial of number entered by User.
 * Developer : Divyesh
 * Date      : 02-Jun-2022
 * Time      : 5:33:11 AM
 */
public class Factorial {

	public static void main(String[] args) {

		/* Initialize fact variable to 1 which stores factorial of number further. */
		int fact = 1;

		Scanner sc = new Scanner(System.in);

		/* Taking the input from the user and store it to the number vriable. */
		System.out.println("Enter the Number :: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + number + " is :: " + fact);

		sc.close();
	}
}
