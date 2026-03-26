package com.ex;

public class LexicoGraphLargestString {
	public static void lexicoGraphLargestString(String[] fruit) {
		String largest = fruit[0];
		for(int i=0 ; i<fruit.length ; i++) {
			if(largest.compareToIgnoreCase(fruit[i]) < 0) {
				largest = fruit[i];
			}
		}
		System.out.println("Largest : "+largest);
	}
	public static void main(String[] args) {
		String[] fruit = {"apple","banana","mango"};
		lexicoGraphLargestString(fruit);
	}
}