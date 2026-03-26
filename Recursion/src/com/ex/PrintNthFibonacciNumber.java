package com.ex;

public class PrintNthFibonacciNumber {
	public static int printNthFibonacciNumber(int n) {
		if(n ==0 | n == 1) {
			return n;
		}
		int fb1 =  printNthFibonacciNumber(n-1);
		int fb2 =  printNthFibonacciNumber(n-2);
		return fb1+fb2;
	}
	public static void main(String[] args) {
		int n = 25;
		System.out.println(printNthFibonacciNumber(n));
	}
}