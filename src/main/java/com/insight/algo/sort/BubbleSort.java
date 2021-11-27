package com.insight.algo.sort;

import java.util.Scanner;

public class BubbleSort {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the total length of the array: ");
		int n = sc1.nextInt();

		System.out.println("Enter the " + n + " numbers: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc1.nextInt();

		System.out.println("Input array : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
		
		int[] sortedArray = bubbleSort(arr);
		
		System.out.println("\nSorted array : ");
		for (int i = 0; i < n; i++)
			System.out.print(sortedArray[i]+" ");
	}

	private static int[] bubbleSort(int[] input) {
		int temp;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				if (input[j] > input[j + 1]) {
					temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;
	}

}
