package com.ex;

public class OddOrEven {
	
	public static void oddOrEven(int n) {
		int bitMasked = 1;
		if((n & bitMasked) == 0) {
			System.out.println("Is Even");
		} else {
			System.out.println("Is Odd");
		}
	}
	public static void main(String[] args) {
		oddOrEven(7);
		oddOrEven(10);
	}
}