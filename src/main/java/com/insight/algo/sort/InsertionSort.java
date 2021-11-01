package com.insight.algo.sort;

public class InsertionSort {

	/**
	 * 
	 * PROBLEM STATEMENT
	 * =================
	 * Given a sorted list with an unsorted number 'x' in the rightmost cell, 
	 * write a simple code to insert 'x' into the array so that it remains sorted?
	 * 		Sample input : [1, 2, 4, 5, 3]
	 * 		Sample output : [1, 2, 3, 4, 5]	
	 * 
	*/
	
	public static void main(String[] args) {
		
		int[] inputArr = {1, 2, 4, 5, 3};
		insertAndSort(inputArr);
		
	}
	
	private static int[] insertAndSort(int[] inputArr) {
		int x = inputArr[inputArr.length-1];
		for(int i = 0 ; i < inputArr.length ; i++) {
			if(x < inputArr[i]) {
				for(int j = inputArr.length-2; j >= i; j--) {
					inputArr[j+1] = inputArr[j];
				}
				inputArr[i] = x;
				break;
			}
		}
		for(int i = 0 ; i < inputArr.length ; i++) {
			System.out.println(inputArr[i]);
		}
		return inputArr;
	}
}
