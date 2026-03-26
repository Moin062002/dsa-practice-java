package com.ex;

public class ClearLastiBits {
	public static int clearLastiBits(int n,int i) {
		int bitmasked = (-1)<<i;
		return n & bitmasked;
	}
	public static void main(String[] args) {
		System.out.println(clearLastiBits(15,2));
	}
}