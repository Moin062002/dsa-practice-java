package com.ex;

import java.util.ArrayList;

public class ContainerWithMostWaterBruteForce {
	public static int mostWaterArea(ArrayList<Integer> height) {
		int maxWater = 0;
		for(int i=0 ; i<height.size() ; i++) {
			for(int j=i+1 ; j<height.size() ; j++) {
				int length = Math.min(height.get(i), height.get(j)); 
				int width = j-i;
				int currWater = length*width;
				maxWater = Math.max(maxWater, currWater);
			}
		}
		return maxWater;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		System.out.println(mostWaterArea(list));	
	}
}