package com.ex;

import java.util.Stack;

public class ReverseAStack {
	public static void pushAtBottomStack(Stack<Integer> s, int data) {
		if (s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottomStack(s, data);
		s.push(top);
	}

	public static void reverseStack(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverseStack(s);
		pushAtBottomStack(s, top);
	}

	public static void printStack(Stack<Integer> s) {
		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		reverseStack(s);
		printStack(s);
	}
}
