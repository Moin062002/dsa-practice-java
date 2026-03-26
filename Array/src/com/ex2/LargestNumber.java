package com.ex2;

public class LargestNumber {
	public static int largest(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] > max) {}
			max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {5,10,18,16,75};
		int largest = largest(arr);
		System.out.println("Largest Number is "+largest);
	}
}