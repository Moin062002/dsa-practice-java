package com.ex;

public class ReverseAGivenNumber {
	public static int reverse(int n) {
		int rev = 0;
		while(n > 0) {
			int lastdigit = n % 10;
			rev = lastdigit+(rev*10);
			n = n / 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println(reverse(15678));
	}
}