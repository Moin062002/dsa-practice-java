package com.ex;

public class Clearithbit {
	public static int clearithbit(int n,int i) {
		int bitmasked = ~(1<<i);
		return n & bitmasked;	
	}
	public static void main(String[] args) {
		System.out.println(clearithbit(10,1));
	}

}
