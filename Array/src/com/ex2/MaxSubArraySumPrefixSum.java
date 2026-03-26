package com.ex2;

public class MaxSubArraySumPrefixSum {
	public static void prefixsum(int[] arr) {
		int curr = 0;
		int max = Integer.MIN_VALUE;
		int[] prefix = new int[arr.length];
		
		prefix[0] = arr[0];
		// calculate prefix array
		for(int i=1 ; i<prefix.length ; i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i ; j<arr.length ; j++) {
			    curr = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
			    if(curr > max) {
					max = curr;
				}
			}
		}
		System.out.println("Max Sum of SubArray is: "+max);
	}	
	public static void main(String[] args) {
	//	int[] arr= {2,4,6,8,10};
		int[] arr = {1,-2,6,-1,3};
		prefixsum(arr);
	}
}