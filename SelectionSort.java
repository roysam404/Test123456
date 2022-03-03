package com.SamplePackage;

public class SelectionSort {

	// Complexity = n(n-1)/2 | O(n2)
	/*
	 * Selection sort is a sorting algorithm, specifically an in-place comparison
	 * sort. It has O(n2) time complexity, making it inefficient on large lists, and
	 * generally performs worse than the similar insertion sort. Selection sort is
	 * noted for its simplicity, and it has performance advantages over more
	 * complicated algorithms in certain situations, particularly where auxiliary
	 * memory is limited.
	 * 
	 * The algorithm divides the input list into two parts: the sublist of items
	 * already sorted, which is built up from left to right at the front (left) of
	 * the list, and the sublist of items remaining to be sorted that occupy the
	 * rest of the list. Initially, the sorted sublist is empty and the unsorted
	 * sublist is the entire input list. The algorithm proceeds by finding the
	 * smallest (or largest, depending on sorting order) element in the unsorted
	 * sublist, exchanging (swapping) it with the leftmost unsorted element (putting
	 * it in sorted order), and moving the sublist boundaries one element to the
	 * right.
	 * 
	 */		public static int[] SS(int[] a)
	 {
		         
			for (int i = 0; i < a.length - 1; i++)
			{
				int index = i;
				for (int j = i + 1; j < a.length; j++)
					if (a[j] < a[index]) 
						index = j;
						int temp = a[index];  
						a[index] = a[i];
						a[i] = temp;
			}
			return a;
		}
		     
		public static void main(String a[]){
		         
			int[] arr1 = {10,34,2,56,7,67,88,42};
			int[] arr2 = SS(arr1);
			for(int i:arr2){
				System.out.print(i);
				System.out.print(", ");
			}
		}

}
