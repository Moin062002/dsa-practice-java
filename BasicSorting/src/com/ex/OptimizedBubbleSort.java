package com.ex;

public class OptimizedBubbleSort {
	public static void OpbubbleSort(int[] arr) {
		for(int i=0 ; i<arr.length-1 ; i++) {
			boolean swap = false;
			for(int j=0 ; j<arr.length-1-i ; j++) {
				if(arr[j] > arr[j+1]) {
					// swapping
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false) {
				break;
			}
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		OpbubbleSort(arr);
		printArray(arr);
	}
}