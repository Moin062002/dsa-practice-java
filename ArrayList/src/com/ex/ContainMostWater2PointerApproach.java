package com.ex;

import java.util.ArrayList;

public class ContainMostWater2PointerApproach {
	public static int waterArea(ArrayList<Integer> height) {
		int maxWater = 0;
		int lp = 0;
		int rp = height.size()-1;
		
		while(lp < rp) {
		// find water area
		int lt = Math.min(height.get(lp), height.get(rp));
		int width = rp - lp;
		int currWater = lt*width;
		maxWater = Math.max(maxWater, currWater);
		
		// update pointer
		  if(height.get(lp) < height.get(rp)) {
			  lp++;
		  } else {
			  rp--;
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
		System.out.println(waterArea(list));
	}
}