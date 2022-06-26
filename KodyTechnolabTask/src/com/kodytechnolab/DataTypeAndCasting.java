package com.kodytechnolab;

/**
 * 
 * Objective : This Program illustrate Type casting and Conversion between data
 * types. Developer : Divyesh Date : 03-Jun-2022 Time : 5:41:36 AM
 */
public class DataTypeAndCasting {

	public static void main(String[] args) {

		byte b;
								
		double c = 32376868688686886868.142;
		
		/* We can put underscore to seperate number in any literls compiler ignore it.*/
		int underscore = 123_234;
		
		System.out.println("Integer literal with underscore :: " + underscore);
		
		/* Assign integer literal to a variable which is in binary form with underscore leading 0b or 0B. */
		int a =  0b1101_0101_0001_1010;
		
		/* It converts it in binary to decimal form. */
		System.out.println("Integer literal with binary form :: " + a);
		
		/* Explicit type casting from double to byte. */
		byte d = (byte)c;

		/* Explicit type casting from int to byte which is also called narrowing convertion. */
		b = (byte) a;
		
		/* We can assign integer literal as hexadecimal form with leading 0X or 0x. */
		int hexa = 0xA;
		
		System.out.println("Integer literal with hexa decimal form :: " + hexa);
		
		/* We can assign integer literal as octal form with leading 0. */
		int octal = 010;
		
		/* We can assign character literal with octal or hexadecimal form : for octal form : '\000' and for hexadecimal form : '\u0000'. */
		char octal_char = '\141';
		char octal_hexa = '\u0061';
		
		System.out.println("hexadecimal form in Character :: " + octal_hexa);

		System.out.println("Octal form in Character :: " + octal_char);
		
		System.out.println("Integer literal with octal form :: " + octal);
		
		System.out.println("Double to Byte Casting :: " + d);
		System.out.println("Integer to Byte Casting :: " + b);

	}
}
