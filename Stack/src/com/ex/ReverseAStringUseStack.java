package com.ex;

import java.util.Stack;

public class ReverseAStringUseStack {
	public static String reverseString(Stack<Character> s, String str) {
		int idx = 0;
		while(idx < str.length()) {
			char ch = str.charAt(idx);
			s.push(ch);
			idx++;
		}
		StringBuilder sb = new StringBuilder();
		while(!s.isEmpty()) {
		char curr = s.pop();
		sb.append(curr);
		}
	     str = sb.toString();
		return str;
	}
	
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		String str = "abc";
		System.out.print(reverseString(s,str));
	}
}
