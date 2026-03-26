package com.ex;

public class OptimizedPowerN {
	public static int optimizedPowerN(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int halfpower = optimizedPowerN(x, n/2);
		int halfpowerSqr = halfpower * halfpower;
		// odd
		if(n % 2 !=0) {
			halfpowerSqr = x * halfpowerSqr;
		}
		return halfpowerSqr;
	}
	public static void main(String[] args) {
		System.out.println(optimizedPowerN(2,3));
	}
}