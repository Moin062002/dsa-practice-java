package com.ex;

import java.util.Scanner;

public class LargestSmall {
	public static void largestSmall(int[][] arr) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr[0].length; j++) {
				largest = Math.max(largest, arr[i][j]);
				smallest= Math.min(smallest, arr[i][j]);
			}
		}
		System.out.println("Largest No: "+largest);
		System.out.println("Smallest No: "+smallest);
	}
	public static boolean findkey(int[][] arr,int key) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				if(arr[i][j] == key) {
					System.out.println("Found at index ("+i+","+j+")");
					return true;
				}
			}
		}
		System.out.println("Not Found");
		return false;
	}
	public static void entervalue(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2D array");
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr[0].length ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	public static void printMatrix(int[][] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		entervalue(arr);
		printMatrix(arr);
		findkey(arr,5);
		largestSmall(arr);
	}
}
