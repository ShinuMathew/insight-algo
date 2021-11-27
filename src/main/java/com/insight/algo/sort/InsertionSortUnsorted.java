package com.insight.algo.sort;

public class InsertionSortUnsorted {

	/**
	 * 
	 * PROBLEM STATEMENT
	 * =================
	 * Given a sorted list with an unsorted number 'x' in the rightmost cell, 
	 * write a simple code to insert 'x' into the array so that it remains sorted?
	 * 		Sample input : [3, 4, 7, 5, 6, 2, 1]
	 * 		Sample output : [1, 2, 3, 4, 5, 6, 7]	
	 * 
	*/
	
	public static void main(String[] args) {		
		int[] inputArr = {3, 4, 7, 5, 6, 2, 1};
		insertAndSort(inputArr);		
	}
	
	/*
	 * Solution from right to left */
	private static int[] insertAndSort(int[] inputArr) {
		
		for(int a = 0; a < inputArr.length; a++) {
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
		}
		for(int i = 0 ; i < inputArr.length ; i++) {
			System.out.println(inputArr[i]);
		}
		return inputArr;
	}
}
