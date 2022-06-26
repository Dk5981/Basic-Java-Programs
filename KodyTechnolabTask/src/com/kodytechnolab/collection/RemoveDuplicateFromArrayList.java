package com.kodytechnolab.collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Objective : This Program Removes Duplicate Element From the ArrayList.
 * Developer : Divyesh
 * Date : Jun 20, 2022
 * Time : 12:35:31 PM
 */
public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<String>();
		String input;
		
		System.out.println("Enter the Elements and for Quit enter 'Q': ");
		do {
			System.out.print("Enter the value : ");
			input = sc.next();

			if (!input.equalsIgnoreCase("Q")) {
				arrayList.add(input);
			}

		} while (!input.equalsIgnoreCase("Q"));

		System.out.println("Before Remove Duplicate Elements :");
		System.out.println(arrayList.size());

		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if (arrayList.get(i).equals(arrayList.get(j))) {
					arrayList.remove(j);
					j--;
				}
			}
		}

		System.out.println("After Remove Duplicate Elements : ");

		System.out.println(arrayList);
		
		sc.close();
	}
}