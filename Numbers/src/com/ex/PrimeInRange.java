package com.ex;

public class PrimeInRange {
	public static boolean primeOrNot(int num) {
		if(num==2) {
			return true;
		}
		for(int i=2; i<=Math.sqrt(num); i++ ) {
			if(num % i ==0 ) {
				return false;
			}
		}
		return true;
	}
	public static void primeInRange(int n) {
		for(int i=2 ; i<=n ; i++) {
			if(primeOrNot(i)) {
				System.out.print(i+" ");
			}
		} 
	}
	public static void main(String[] args) {
		int n = 10;
		primeInRange(n);
	}
}