package com.SamplePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	/*
	 * Merge Sort is a Divide and Conquer algorithm. It divides input array in two
	 * halves, calls itself for the two halves and then merges the two sorted
	 * halves. The merge() function is used for merging two halves. The merge(arr,
	 * l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are
	 * sorted and merges the two sorted sub-arrays into one.
	 */

	public static void main(String[] args) 
	{
		System.out.println("mergesort");
		int[] input = { 87, 57,-20, 370, 110, 90, 610, 02, 710, -2 ,140, 203, 150, 0 };
		String a=Arrays.toString(input);
		
		//System.out.println("Demo"+a);
		System.out.println("Demo"+a.charAt(5));
		
		System.out.println("array before sorting");
		System.out.println(Arrays.toString(input));
		// sorting array using MergeSort algorithm
		mergesort(input);
		System.out.println("array after sorting using mergesort algorithm");
		System.out.println(Arrays.toString(input));
	}

	public static void mergesort(int[] input) 
	{
		mergesort(input, 0, input.length - 1);
		
	}

	private static void mergesort(int[] input, int start, int end)
	{
		// break problem into smaller structurally
		// identical problems
		int mid = (start + end) / 2;
		if (start < end) 
		{
			mergesort(input, start, mid);
			mergesort(input, mid + 1, end);
		} 
		// merge solved pieces to get solution to original problem
		int i = 0, first = start, last = mid + 1;
		int[] tmp = new int[end - start + 1];
		while (first <= mid && last <= end) 
		{
			tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
		}
		while (first <= mid) 
		{
			tmp[i++] = input[first++];
		}
		while (last <= end) 
		{
			tmp[i++] = input[last++];
		}
		i = 0;
		while (start <= end) 
		{
			input[start++] = tmp[i++];
		}
	}

}


