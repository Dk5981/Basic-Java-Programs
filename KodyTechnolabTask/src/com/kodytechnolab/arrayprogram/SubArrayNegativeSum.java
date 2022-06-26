package com.kodytechnolab.arrayprogram;

import java.util.Scanner;

/**
 * Objective : Developer : Divyesh Date : Jun 15, 2022 Time : 4:34:21 PM
 */
public class SubArrayNegativeSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* Taking the input from user. */
		System.out.println("Enter the size of an array :: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Element: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];

				if (sum < 0) {
					count++;
				}
			}
		}
		System.out.println("Nagative sum of subarray is : " + count);
	}
}