package com.ex;

public class BinarySearch {
	public static int binarySearch(int[] arr,int key) {
		int start =0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == key) { // if in key in mid
				return mid;
			}
			if(arr[mid] > key) { // left
				end = mid-1;
			}
			if(arr[mid] < key) { // right
				start = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16,18,20};
		int key = 12;
		int index = binarySearch(arr, key);
		if(index == -1) {
			System.out.println("Key Index Not Found");
		} else {
			System.out.println("Key Index is :"+index);
		}
	}
}