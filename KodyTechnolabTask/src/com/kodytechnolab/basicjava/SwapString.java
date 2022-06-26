package com.kodytechnolab.basicjava;

import java.util.Scanner;


/**
 * 
 * Objective : This Programs Performs Swap String Objects without other Object.
 * Developer : Divyesh
 * Date : June 13, 2022
 * Time : 12:53:05 PM
 */
public class SwapString
{
	private static Scanner scan;

	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		System.out.println("Enter The First String : ");
		String firstvalue = scan.next();

		System.out.println("Enter The Second String : ");
		String secondvalue = scan.next();
		
		firstvalue = firstvalue.concat(secondvalue);
		secondvalue = firstvalue.substring(0, (firstvalue.length() - secondvalue.length()));
		firstvalue = firstvalue.substring(secondvalue.length());

		System.out.println("After Swap Value : ");
		System.out.println("First value = " + firstvalue);
		System.out.println("Second value = " + secondvalue);
	}
}