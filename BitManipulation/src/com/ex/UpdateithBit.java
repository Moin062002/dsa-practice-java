package com.ex;

public class UpdateithBit {
	public static int clearithBit(int n, int i) {
		int bitmasked = ~(1<<i);
		return n & bitmasked;
	}
	
	public static int setithBit(int n, int i) {
		int bitmasked = 1<<i;
		return n | bitmasked;
	}
	
	public static int updateithBit(int n, int i, int newBit) {
		if(newBit == 0) {
		return	clearithBit(n,i);
		}else {
		return	setithBit(n,i);
		}
	}
	public static void main(String[] args) {
		System.out.println(updateithBit(10,2,0));
	}

}
