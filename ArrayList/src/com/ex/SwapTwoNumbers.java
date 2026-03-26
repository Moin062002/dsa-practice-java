package com.ex;

import java.util.ArrayList;

public class SwapTwoNumbers {
	public static void swap(ArrayList<Integer> list,int id1,int id2) {
		int temp = list.get(id2);
		list.set(id2, list.get(id1));
		list.set(id1, temp);
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(8);
		swap(list,1,3);
	}
}