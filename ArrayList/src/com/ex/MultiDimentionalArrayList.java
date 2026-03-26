package com.ex;

import java.util.ArrayList;

public class MultiDimentionalArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1); list1.add(2);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(3); list2.add(4);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(5); list3.add(6);
		
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);
		
		System.out.println(mainList);
		
		for(int i=0 ; i<mainList.size() ; i++) {
			ArrayList<Integer> currlist = mainList.get(i);
			for(int j=0 ; j<currlist.size() ; j++) {
				System.out.print(currlist.get(j)+" ");
			}
			System.out.println();
		}
	}
}
