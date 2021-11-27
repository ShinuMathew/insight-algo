package com.insight.algo.search;

public class BinarySearch {

	/**
	 * Given an array of numbers [6, 2, 9, 6, 11, 23, 1, 16, 7, 3, 2, 17, 22, 34, 11], 
	 * implement Binary search algorithm to search for the value 23 in the array
	 */
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 8, 9, 10, 11, 13, 16};
//		searchEntryIterative(arr, 13);
		int length = arr.length;
		int index = searchEntryByRecurssion(arr, 0, length-1, 9);
		if(index >= 0) 
			System.out.println(String.format("Found element %s at %s index", 9, index));
		else
			System.out.println(String.format("Element %s Not found", 9));
	}
	
	public static void searchEntryIterative(int[] arr, int val) {
		
		int length = arr.length;
		int mid = (length - 1) / 2;
		if(arr[mid] == val)
			System.out.println(String.format("Found element %s at %s index", val, mid));
		else if(val < arr[mid]) {
			for(int i = 0; i <= mid; i++) {
				if(arr[i] == val) {
					System.out.println(String.format("Found element %s at %s index", val, i));
					break;
				}	
			}
		} else if(val > arr[mid]) {
			for(int i = mid+1; i < length; i++) {
				if(arr[i] == val) {
					System.out.println(String.format("Found element %s at %s index", val, i));
					break;
				}				
			}
		}
	}
	
	public static int searchEntryByRecurssion(int[] arr, int l, int r, int val) {
		
		if(r>=l) {
			int mid = (l + r)/2;
			if(arr[mid] == val)
				return mid;
			if(arr[mid] < val) {
				r = mid - 1;
				return searchEntryByRecurssion(arr, l, r, val);
			}
			l = mid + 1;
			return searchEntryByRecurssion(arr, l, r, val);
		}
		return -1;
	}
}
