package com.ex;

public class SumOfFirstnNumber {
	public static int sumOfFirstnNumber(int n) {
		if(n==1) {
			return 1;
		}
		return n+ sumOfFirstnNumber(n-1);
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfFirstnNumber(n));
	}
}
