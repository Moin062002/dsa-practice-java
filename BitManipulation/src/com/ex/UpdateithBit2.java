package com.ex;

public class UpdateithBit2 {
	public static int clearithbit(int n,int i) {
	  int bitmasked = ~(1<<i);
	  return n & bitmasked;
	}
	
	public static int updateithBit2(int n, int i, int newBit) {
		n = clearithbit(n,i);
		int bitmasked = newBit<<i;
		return n | bitmasked;
	}
	public static void main(String[] args) {
		System.out.println(updateithBit2(10,1,1));
	}

}
