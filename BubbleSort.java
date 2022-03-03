package com.SamplePackage;

public class BubbleSort {

	// Complexity = O(n2) | Best case = O(n)

	// Bubble Sort
	/*
	 * // Bubble Sort is the simplest sorting algorithm that works by repeatedly
	 * swapping the adjacent elements if they are in wrong order. Sometimes referred
	 * to as sinking sort, is a simple sorting algorithm that repeatedly steps
	 * through the list to be sorted, compares each pair of adjacent items and swaps
	 * them if they are in the wrong order. The pass through the list is repeated
	 * until no swaps are needed, which indicates that the list is sorted.
	 * 
	 * Bubble sort has worst-case and average complexity both О(n2), where n is the
	 * number of items being sorted. There exist many sorting algorithms, such as
	 * merge sort with substantially better worst-case or average complexity of O(n
	 * log n). Even other О(n2) sorting algorithms, such as insertion sort, tend to
	 * have better performance than bubble sort. Therefore, bubble sort is not a
	 * practical sorting algorithm when n is large.
	 */
	static int temp;

	public static void bubble_srt(int array[]) {

		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
			printNumbers(array);
		}
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubble_srt(input);

		int[] a = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		bubble_srt(a);
	}

}


