package com.kodytechnolab.collection;

import java.util.Scanner;

/**
 * Objective : This Program performs sort operation on String Array. 
 * Developer : Divyesh
 * Date : Jun 20, 2022 Time : 11:04:20 AM
 */
public class SortStringArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an Array : ");
		int size = sc.nextInt();

		String arr[] = new String[size];

		System.out.println("Enter the Array Elements :: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting of String Array : ");

		for (String s : arr) {
			System.out.println(s);
		}
		sc.close();
	}
}