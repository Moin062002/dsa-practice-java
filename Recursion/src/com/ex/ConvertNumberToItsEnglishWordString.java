package com.ex;

public class ConvertNumberToItsEnglishWordString {
	static String[] digits = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	public static void convertNumberToItsEnglishWordString(int num) {
		if(num == 0 ) {
			return;
		}
		int lastdigits = num % 10;
		num = num / 10;
		convertNumberToItsEnglishWordString(num);
		System.out.print(" "+digits[lastdigits]);
	}
	public static void main(String[] args) {
		int num = 2026;
		convertNumberToItsEnglishWordString(num);
	}

}
