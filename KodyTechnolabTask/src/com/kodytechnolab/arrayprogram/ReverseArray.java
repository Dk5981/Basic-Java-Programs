package com.kodytechnolab.arrayprogram;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Objective : Java Program to print the elements of an array in reverse order.
 * Developer : Divyesh Date : Jun 14, 2022 Time : 11:13:54 AM
 */
public class ReverseArray {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		try {
			System.out.println("Enter the Number of Array Elements :: ");
			int no = sc.nextInt();

			/* Create array of size no variable. */
			int[] arr = new int[no];

			/* Iterate over for loop to taking array elements from the User. */
			System.out.println("Enter the Array Elements :: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				System.out.println("arr[" + i + "]--->" + arr[i]);
			}

			/* Array Elements in Reverse Order. */
			System.out.println("Array Elements in Reverse Order.");
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i] + " ");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a Valid Input.");
		}
	}
}