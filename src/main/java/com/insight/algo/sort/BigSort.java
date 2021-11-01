package com.insight.algo.sort;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * PROBLEM STATEMENT
 * =================
 * Consider an array of numeric strings where each string is a positive number with anywhere from  to  digits. 
 * Sort the array's elements in non-decreasing, or ascending order of their integer values and return the sorted array.
 * 		Sample Input 0 : 6, 31415926535897932384626433832795, 1, 3, 10, 3, 5
 * 		Sample Output 0 : 1, 3, 3, 5, 10, 31415926535897932384626433832795
 * 
*/

public class BigSort {

	public static void main(String[] args) {
		List<String> unsortedArray = Arrays.asList("6",
				"31415926535897932384626433832795",
				"1",
				"3",
				"10",
				"3",
				"5");		
		sortArray(unsortedArray);
	}

	/* Time Complexity : Low */
	public static List<String> sortArray(List<String> unsortedArray) {
		unsortedArray.sort((s1, s2) -> {
			if(s1.toString().length() > s2.toString().length()) return 1;
			if(s1.toString().length() < s2.toString().length()) return -1;
			return (new BigInteger(s1.toString()).compareTo(new BigInteger(s2.toString())));
		});
		unsortedArray.forEach(System.out::println);
		return unsortedArray;
	}
	
	/* Time Complexity : Medium => Converting String to BigInteger and then compare is highly complex
	public static List<String> sortArray(List<String> unsortedArray) {
		List<BigInteger> unsortedIntegerArray = unsortedArray.stream().map(ele -> new BigInteger(ele)).collect(Collectors.toList());
		unsortedIntegerArray.sort((b1, b2) -> b1.compareTo(b2));		
		List<String> sortedStringArray = unsortedIntegerArray.stream().map(ele -> ele.toString()).collect(Collectors.toList());
		sortedStringArray.forEach(System.out::println);
		return sortedStringArray;
	}*/
	
	/* Time Complexity : High
	 public static List<String> sortArray(List<String> unsortedArray) {
		List<BigInteger> unsortedIntegerArray = unsortedArray.parallelStream().map(ele -> new BigInteger(ele)).collect(Collectors.toList());
		unsortedArray.sort(
				(b1, b2) -> (b1.length() > 10 || b2.length() > 10) ? (new BigInteger(b1)).compareTo(new BigInteger(b2))
						: Integer.parseInt(b1) > Integer.parseInt(b2) ? 1 : -1);
		unsortedArray.forEach(System.out::println);
		return unsortedArray;
	}*/
	
	
}
