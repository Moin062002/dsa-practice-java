package com.ex;

public class PrintXPowerN {
	public static int printXPowerN(int x,int n) {
		if(n == 0) {
			return 1;
		}
		return x * printXPowerN(x, n-1);
	}
	public static void main(String[] args) {
		System.out.println(printXPowerN(2,3));
	}
}