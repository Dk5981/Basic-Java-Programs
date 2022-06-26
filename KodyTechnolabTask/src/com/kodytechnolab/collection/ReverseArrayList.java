package com.kodytechnolab.collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Objective : This Program Performs Reverse ArrayList. 
 * Developer : Divyesh 
 * Date      : Jun 20, 2022 Time : 1:07:57 PM
 */
public class ReverseArrayList {

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

		System.out.println("Reverse ArrayList :: ");
		
		for(int i = arrayList.size()-1; i >= 0; i--)
		{
			System.out.print(arrayList.get(i) + " ");
		}
		sc.close();
	}
}