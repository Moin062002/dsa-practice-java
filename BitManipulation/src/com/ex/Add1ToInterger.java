package com.ex;

public class Add1ToInterger {
	public static int add1ToInterger(int n) {
		return -~n;
	}
	public static void main(String[] args) {
		System.out.println(add1ToInterger(4));
	}
}