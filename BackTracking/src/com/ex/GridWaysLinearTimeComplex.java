package com.ex;

public class GridWaysLinearTimeComplex {
	 public static long gridWays(int n, int m) {

	        int N = n + m - 2;   // total moves
	        int r = n - 1;       // choose positions for Down moves

	        long res = 1;

	        for (int i = 1; i <= r; i++) {
	            res = res * (N - r + i) / i;
	        }

	        return res;
	    }

	    public static void main(String[] args) {

	        int n = 3;
	        int m = 3;

	        System.out.println("Total Ways = " + gridWays(n, m));
	    }

}
