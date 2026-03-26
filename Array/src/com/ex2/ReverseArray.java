package com.ex2;

public class ReverseArray {
	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int temp = 0;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16,18,20};
		reverse(arr);
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
