package com.ex;

public class Palindrome {
	public static boolean palindrome(String st) {
		for(int i=0; i<st.length()/2 ; i++) {
			int n= st.length();
			if(st.charAt(i) != st.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "noon";
		System.out.println(palindrome(str));
	}
}