package com.ex;

public class BinomialCoefficient {
	public static int factorial(int n) {
		int f = 1;
		for(int i=1 ; i<=n ; i++) {
			f = f * i;
		}
		return f;
	}
	public static int bioCoeff(int n , int r) {
		int fac_n = factorial(n);
		int fac_r = factorial(r);
		int fac_nr = factorial(n-r);
		int bioCoeff = fac_n/(fac_r*fac_nr);
		return bioCoeff;
	}
	public static void main(String[] args) {
		int n=6;
		int r = 4;
		System.out.println(bioCoeff(n,r));
	}

}
// Binomial Coefficient formal
//   Crn = n!/r!(n-r)! 