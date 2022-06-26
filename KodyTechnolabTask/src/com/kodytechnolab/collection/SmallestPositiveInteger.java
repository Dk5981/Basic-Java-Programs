package com.kodytechnolab.collection;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SmallestPositiveInteger {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Enter the size of an array :: ");
			int size = sc.nextInt();

			if (size == 0) {
				throw new Exception();
			}

			int ans = 1;

			int arr[] = new int[size];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] <= 0)
					throw new Exception();
			}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] <= ans) {
					ans += arr[i];
				} else {
					break;
				}
			}
			System.out.println("Smallest int is :: " + ans);
		} catch (InputMismatchException e) {
			System.out.println("String Value is not allowed.");
		} catch (Exception e) {
			System.out.println("Negative value or zero is not allowed.");
			sc.close();
		}
	}
}