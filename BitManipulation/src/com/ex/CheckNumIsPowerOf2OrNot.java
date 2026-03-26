package com.ex;

public class CheckNumIsPowerOf2OrNot {
	public static boolean checkNumIsPowerOf2OrNot(int n) {
		int bitmasked = n-1;
        return ((n & bitmasked) == 0);
	}
	public static void main(String[] args) {
		System.out.println(checkNumIsPowerOf2OrNot(8));
	}
}