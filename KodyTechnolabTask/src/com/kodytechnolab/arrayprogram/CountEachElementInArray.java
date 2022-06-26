package com.kodytechnolab.arrayprogram;

import java.util.Scanner;

/**
 * 
 * Objective : This Program calculate Frequency of each array elements.
 * Developer : Divyesh Date : Jun 14, 2022 Time : 11:11:36 AM
 */
public class CountEachElementInArray {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		/* Taking input from the user. */
		System.out.println("Enter the number of elements that you want to insert in array.");
		int no = Integer.parseInt(sc.nextLine());

		/* Create array of size no variable. */
		String arr[] = new String[no];

		System.out.println("Enter the Array Elements : ");

		/* Iterate over for loop to taking array elements from the User. */
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Element :: ");
			arr[i] = sc.next();
		}

		for (int i = 0; i < arr.length; i++) {
			/* Initialize count variable to count frequency of array elements. */
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				/* compare array element with its next element. */
				if (arr[i].equals(arr[j])) {
					/* Increment count variable as it is duplicate. */
					count++;
					if ((count > 1 && j != (arr.length - 1)) || (count > 1 && j == (arr.length - 1))) {
						arr[j] = "-1";
					}
				}
			}
			if (arr[i] == "-1") {
				continue;
			}
			System.out.println(arr[i] + " occured -->" + count + "times.");
		}
	}
}