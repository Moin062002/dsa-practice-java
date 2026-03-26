package com.ex;

public class CheckArraySortedOrNot {
	public static boolean checkArraySortedOrNot(int[] arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return checkArraySortedOrNot(arr,i+1);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(checkArraySortedOrNot(arr,0));
	}
}