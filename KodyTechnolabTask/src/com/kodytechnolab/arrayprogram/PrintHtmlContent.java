package com.kodytechnolab.arrayprogram;

import java.util.Scanner;

public class PrintHtmlContent {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		/* Taking the Input from the User. */
		System.out.println("How Many Lines need to be added?");
		int line = Integer.parseInt(sc.nextLine());

		String arr[] = new String[line];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}

		for (int i = 0; i < line; i++) {
			String split[] = arr[i].split("[<>]");
			if (("/" + split[1]).equals(split[split.length - 1])) {
				System.out.println(split[2]);
			} else {
				System.out.println("None");
			}
		}
	}
}