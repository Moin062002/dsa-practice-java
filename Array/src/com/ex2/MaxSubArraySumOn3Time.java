package com.ex2;

public class MaxSubArraySumOn3Time {
	public static void maxSubArraySum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
				int curr = 0;
				for(int k=i ; k<=j ; k++) {
				    curr += arr[k];
				}
				 if(curr > max) {
				    	max = curr;
				    }
			}
		}
		System.out.println("Max SubArray Sum is: "+max);
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		maxSubArraySum(arr);
	}
}