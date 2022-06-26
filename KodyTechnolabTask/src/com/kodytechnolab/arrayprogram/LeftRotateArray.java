package com.kodytechnolab.arrayprogram;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Objective : Java Program to left rotate the elements of an array Developer :
 * Divyesh Date : Jun 14, 2022 Time : 11:49:37 AM
 */
public class LeftRotateArray {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter the Number of Array Elements :: ");
		int no = sc.nextInt();

		try {
			/* Create array of size no variable. */
			int[] arr = new int[no];

			/* Iterate over for loop to taking array elements from the User. */
			System.out.println("Enter the Array Elements :: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				System.out.println("arr[" + i + "]--->" + arr[i]);
			}
			
			/* Taking input that is rotation from the user. */
			System.out.println("Enter the Number that how many time you perform rotation on an array.");
			int rotate = sc.nextInt();

			/* Iterate over for loop based on rotate variable. */
			for (int i = 0; i < rotate; i++) {
				int temp = 0;
				/* Store first value of an array Element. */
				temp = arr[0];
				for (int j = 0; j < arr.length; j++) {
					if (j != (arr.length - 1)) {
						arr[j] = arr[j + 1];
					}
				}
				/* Append First Element to Last Index. */
				arr[arr.length - 1] = temp;
			}
			/* Display Array Elements. */
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter valid input(ex: Any digits...)");
		}
	}
}