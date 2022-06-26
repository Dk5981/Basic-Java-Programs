package com.kodytechnolab.arrayprogram;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Objective : Program for matrices multiplication with dynamic values in
 * matrices also dynamic rows and colums Developer : Divyesh Date : Jun 14, 2022
 * Time : 2:26:04 PM
 */
public class MatrixMultiplicationArray {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		try {
			System.out.println("Enter the Rows for Matrix 1 :: ");
			int row1 = sc.nextInt();
			System.out.println("Enter the Cols for Matrix 1 :: ");
			int col1 = sc.nextInt();

			System.out.println("Enter the Rows for Matrix 2 :: ");
			int row2 = sc.nextInt();
			System.out.println("Enter the Cols for Matrix 2 :: ");
			int col2 = sc.nextInt();

			if (col1 != row2) {
				System.out.println("Matrix Multiplication is not possible.");
			} else {
				int[][] matrix1 = new int[row1][col1];
				int[][] matrix2 = new int[row2][col2];
				int[][] matrix3 = new int[row1][col2];

				System.out.println("Enter the Elements for Matrix 1 :: ");

				for (int i = 0; i < row1; i++) {
					for (int j = 0; j < col1; j++) {
						matrix1[i][j] = sc.nextInt();
					}
				}

				System.out.println("Enter the Elements for Matrix 2 :: ");

				for (int i = 0; i < row2; i++) {
					for (int j = 0; j < col2; j++) {
						matrix2[i][j] = sc.nextInt();
					}
				}

				System.out.println("----------Matrix 1 ::----------");
				for (int i = 0; i < row1; i++) {
					for (int j = 0; j < col1; j++) {
						System.out.print(matrix1[i][j] + " ");
					}
					System.out.println();
				}

				System.out.println("----------Matrix 2 ::----------");
				for (int i = 0; i < row2; i++) {
					for (int j = 0; j < col2; j++) {
						System.out.print(matrix2[i][j] + " ");
					}
					System.out.println();
				}

				for (int i = 0; i < row1; i++) {
					for (int j = 0; j < col2; j++) {
						matrix3[i][j] = 0;
						for (int k = 0; k < row2; k++) {
							matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
						}
					}
				}
				System.out.println("----------After Multiplication of 2 Matrix ::----------");

				for (int i = 0; i < row1; i++) {
					for (int j = 0; j < col2; j++) {
						System.out.print(matrix3[i][j] + " ");
					}
					System.out.println();
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Please Enter a Valid Input.");
		}
	}
}