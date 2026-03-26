package com.ex;

public class FIndLengthOfString {
	public static int fIndLengthOfString(String str,int index) {
		if(index == str.length()) {
			return 0;
		}
		return 1+ fIndLengthOfString(str, index+1);
	}
	public static void main(String[] args) {
		String str ="Hello World";
		System.out.println(fIndLengthOfString(str,0));
	}
}