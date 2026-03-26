package com.ex;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);
		System.out.println("---------------------");

		int element = list.get(1);
		System.out.println(element);
		System.out.println("---------------------");

		list.remove(3);
		System.out.println(list);
		System.out.println("---------------------");

		list.add(1, 9);
		System.out.println(list);
		System.out.println("---------------------");

		System.out.println(list.contains(1));
		System.out.println(list.contains(6));
		System.out.println("---------------------");
		
		list.set(1,5);
		System.out.println(list);
		System.out.println("---------------------");
		
		System.out.println(list.size());
		System.out.println("---------------------");
	}
}
