package com.ex;

public class CountingSort {
	public static void countingSort(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length ; i++) {
			largest = Math.max(largest, arr[i]);
		}
		// frequency
		int[] count = new int[largest+1]; // +1 beacuse need to add 0 also
		for(int i=0 ; i<arr.length ; i++) {
			count[arr[i]]++;
		}
		// sorting
		int j=0;
		for(int i=0 ; i<count.length ; i++) {
			while(count[i] > 0) {
			arr[j] = i;
			j++;
			count[i]--;
			}
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,4,1,3,2,4,3,7};
		countingSort(arr);
		printArray(arr);
	}

}
