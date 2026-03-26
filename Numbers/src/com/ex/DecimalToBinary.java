package com.ex;

public class DecimalToBinary {
	public static void demiToBin(int n) {
		int myNum = n;
		int biNum = 0;
		int pow = 0;
	while(n > 0) {
		int remin = n % 2;
		biNum = biNum+ (remin *(int)Math.pow(10,pow));
		pow++;
		n = n/2;
	}
	System.out.println("The Binary Num of "+myNum+ " is "+biNum);
 }
	public static void main(String[] args) {
		int n = 7;
		demiToBin(n);
	}
}
