package com.kodytechnolab.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Objective : This Program finds the largest sum of a contiguous sequence
 * Developer : Divyesh Date : Jun 20, 2022 Time : 2:23:43 PM
 */
public class LargestSumOfSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the Size of Array : ");
			int no = scan.nextInt();

			int[] array = new int[no];
			List<Integer> list = new ArrayList<>();
			System.out.println("Enter " + no + " elements");
			for (int i = 0; i < no; i++) {
				array[i] = scan.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
				int sum = 0;
				for (int j = i; j < array.length; j++) {
					sum = sum + array[j];
					list.add(sum);
				}
			}
			Collections.sort(list);
			System.out.println(list.get(list.size() - 1));
			scan.close();
		} catch (InputMismatchException e) {
			System.out.println("String is not allowed.");
		}
	}

}
