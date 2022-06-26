package com.kodytechnolab.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Objective : This Program Demonstrate List Interface. Developer : Divyesh Date
 * : Jun 23, 2022 Time : 3:28:08 PM
 */
public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		/* Add String Objects to the List Using Add Methods. */
		list.add("Java");
		list.add("Python");

		/* Add String Objects to the List2 Using Add Methods. */
		list2.add("React");
		list2.add("Node");

		/* Add String Object at 1st Position */
		list.add(0, "JavaScript");

		/* Create a new List and initialize it with list. */
		List<String> list1 = new ArrayList<String>(list);

		/* Compare 2 Lists Using equals() and print it. */
		System.out.println(list.equals(list1));
		System.out.println(list);

		/* Add Whole list1 to list using addAll Method. */
		list.addAll(list1);
		System.out.println(list);

		/* Add list2 in list with particular location using addAll Method */
		list.addAll(0, list2);
		System.out.println(list);

		/* Check Whether List Contains elements of List1. */
		System.out.println(list.containsAll(list1));

		/* getClass Method which return class which implements List Interface. */
		System.out.println(list.getClass());

		/* hashCode method which gives hashCode of List. */
		System.out.println(list.hashCode());

		/* indexOf and lastIndexOf method of list. */
		System.out.println(list);
		System.out.println(list.lastIndexOf("Java"));

		/* listIterator Method which returns ListIterator Interface. */
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

		/* retainAll Method that retain all elements that is present in list2. */
		System.out.println("List : " + list);
		System.out.println("List 2 : " + list2);
		list.retainAll(list2);
		System.out.println(list);

		/* subList Method which returns List. */
		List<String> subList = list.subList(0, 2);
		System.out.println(subList);
	}
}