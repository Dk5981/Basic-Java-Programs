package com.kodytechnolab.collection;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Objective : This Program performs copy Elements of Vector to ArrayList.
 * Developer : Divyesh Date : Jun 20, 2022 Time : 10:25:16 AM
 */
public class CopyVectorToArrayList {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		Vector<String> vector = new Vector<String>();
		
		vector.add("English");
		vector.add("Maths");
		vector.add("Science");
		vector.add("Hindi");
		
		arrayList.addAll(vector);
		
		System.out.println(arrayList);
 	}
}