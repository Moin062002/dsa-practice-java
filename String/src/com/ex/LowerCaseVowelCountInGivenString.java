package com.ex;

public class LowerCaseVowelCountInGivenString {
	public static void lowerCaseVowelCountInGivenString(String str) {
		int count =0;
		for(int i=0 ; i<str.length() ; i++) { 
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println("No of LowerCase Vowel In Given String are: "+count);
	}
	public static void main(String[] args) {
		String str = "nk;naskjdfiudfkinaknfdio23943ignkS";
		lowerCaseVowelCountInGivenString(str);
	}
}