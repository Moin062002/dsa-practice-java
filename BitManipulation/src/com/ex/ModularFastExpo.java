package com.ex;

public class ModularFastExpo {
	public static void modularFastExpo(int a,int n,int mod) {
		int ans = 1;
		a = a% mod;
		while(n>0) {
			if((n & 1)==1) {
				ans = (ans * a) % mod;
			}
			a = (a*a) % mod;
			n = n>>1;
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		modularFastExpo(2,5,3);
	}
}