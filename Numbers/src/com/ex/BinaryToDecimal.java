package com.ex;

public class BinaryToDecimal {
	public static void binToDec(int n) {
		int myNum =n;
		int pow = 0;
		int decNum = 0;
		while(n > 0) {
			int ld = n% 10;
			decNum = decNum + (ld *(int)Math.pow(2,pow));
			pow++;
			n = n/10;
		}
		System.out.println("Decimal Num of "+myNum+" is "+decNum);
	}
	public static void main(String[] args) {
		int n = 101;
		binToDec(n);	
	}
}