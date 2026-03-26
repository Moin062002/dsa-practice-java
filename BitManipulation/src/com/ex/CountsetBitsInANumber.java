package com.ex;

public class CountsetBitsInANumber {
	public static void countsetBitsInANumber(int n) {
		int count = 0;
		while(n > 0 ) {
			if((n & 1) != 0) {  // check LSB is 0 or not
				count++;
			}
			n = n>>1;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		countsetBitsInANumber(15);
	}
}