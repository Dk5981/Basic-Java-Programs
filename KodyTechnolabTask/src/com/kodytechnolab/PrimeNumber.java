package com.kodytechnolab;

/**
 * 
 * Objective : This Program finds the prime numbers between 1 to 100.
 * Developer : Divyesh
 * Date      : 02-Jun-2022
 * Time      : 5:37:08 AM
 */
public class PrimeNumber {

	public static void main(String[] args) {

		int j =0;
		
		for(int i = 1; i <= 100; i++)
		{
			for(j = 2; j <= i; j++)
			{
				if(i % j == 0)
				{
					break;
				}
			}
			if(i == j)
			{
				System.out.print(i + " ");
			}
		}
	}

}
