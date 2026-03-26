package com.ex;

public class GetithBit {
	public static int getithBit(int n, int i) {
		int bitmasked = 1<<i;
		if((n & bitmasked) == 0 ) {
			return 0;
		} else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(getithBit(15,2));
	}
}