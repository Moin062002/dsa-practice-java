package com.ex;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a = 5;
		int b= 7;
		System.out.println("Before Swapping: A:"+a+" B:"+b);
		// swap using xor
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: A:"+a+" B:"+b);
	}
}