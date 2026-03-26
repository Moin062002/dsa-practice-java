package com.ex;

public class FloydTriangle {
	public static void floydTriangle(int c, int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int counter = 1;
		int n = 5;
		floydTriangle(counter, n);	
	}
}