package com.ex2;

public class MaxSubArraySumKadanes {
	 public static void kadanesSubArraySum(int[] arr) {
	        int curr = arr[0];
	        int max = arr[0];

	        for(int i = 1; i < arr.length; i++) {
	            curr = Math.max(arr[i], curr + arr[i]);
	            max = Math.max(max, curr);
	        }

	        System.out.println("Max of Subarray is: " + max);
	    }

	    public static void main(String[] args) {
	       // int[] arr = {-1, -3, -4, -2, -5};   // All negative
	        int[] arr = {2,4,6,8,10};
	        kadanesSubArraySum(arr);
	    }
}