package com.ex;

public class PrintAllOccurenceOfKeyInaArray {
	public static void printAllOccurenceOfKeyInaArray(int[] arr,int key,int i) {
		if(i == arr.length) {
			return; 
		}
		if(arr[i] == key) {
			System.out.println(i+" ");
		}
		printAllOccurenceOfKeyInaArray(arr, key, i+1);
	}
	public static void main(String[] args) {
		int[] arr = {2,5,4,6,4,8,2,6,4,2,1,5,6,2};
		printAllOccurenceOfKeyInaArray(arr,2,0);
	}
}
