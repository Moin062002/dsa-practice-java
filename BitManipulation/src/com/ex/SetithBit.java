package com.ex;

public class SetithBit {
	public static int setithBit(int n, int i) {
		int bitmasked = 1<<i;
		return n | bitmasked;
	}
	public static void main(String[] args) {
		System.out.println(setithBit(10,2));
	}
}