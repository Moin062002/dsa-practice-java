package com.ex;

public class FirendsParing {
	public static int firendsParing(int n) {
		if(n == 0 || n ==1 || n == 2) {
			return n;
		}
		//single
		int fnm1 = firendsParing(n-1);
		// pair
		int fnm2 =  firendsParing(n-2);
		int pairways = (n-1) * fnm2;
		
		int totalways = fnm1 + pairways;
		return totalways;
	}
	public static void main(String[] args) {
		System.out.println(firendsParing(4));
	}
}
