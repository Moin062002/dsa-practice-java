package com.ex;

public class LastOccurence {
	public static int lastOccurence(int[] arr, int i, int key) {
		if(i < 0) {
			return -1;
		}
		if(arr[i] == key) {
			return i;
		}
		return lastOccurence(arr, i-1, key);
		
	}
	public static void main(String[] args) {
		int[] arr= {8,1,3,4,6,5,7,9,4,5,1,7};
		System.out.println(lastOccurence(arr, arr.length-1, 5));
	}
}
