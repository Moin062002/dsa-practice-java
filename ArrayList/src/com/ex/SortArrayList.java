package com.ex;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(8);
		
		System.out.println("Original ArrayList: "+list);
		System.out.println("-----------------------------------");
		
		Collections.sort(list);
		System.out.println("Acending Sorted ArrayList: "+list);
		System.out.println("-----------------------------------");
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Decending Sorted ArrayList: "+list);
		System.out.println("-----------------------------------");
	}
}