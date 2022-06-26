package com.kodytechnolab;

public class ArrayBasic {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4 };
		int[] y = x;
		
		int multi[][] = new int[4][];
		
		multi[0] = new int[1];
		multi[1] = new int[2];
		multi[2] = new int[3];
		multi[3] = new int[4];
		
		int k = 0;
						
		for(int i = 0; i < multi.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				multi[i][j] = k;
				k++;
				System.out.print(multi[i][j] + " ");
			}
			System.out.println();
		}
		
//		System.out.println(x);
//		System.out.println(y);
		
		int z = 0;
		
		int j = z;
		x = new int[2];
//		System.out.println(x);

//		for (int i = 0; i < y.length; i++)
//			System.out.print(y[i] + " ");
		
	}
}