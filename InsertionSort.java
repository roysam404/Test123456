package com.SamplePackage;

public class InsertionSort {
	// Complexity | Best O(n) | Worst O(n2) | Average O(n2)
	
	/*
	 * Insertion sort is a simple sorting algorithm that builds the final sorted
	 * array (or list) one item at a time. It is much less efficient on large lists
	 * than more advanced algorithms such as quicksort, heapsort, or merge sort.
	 * However, insertion sort provides several advantages:
	 * 
	 * Simple implementation: Jon Bentley shows a three-line C version, and a
	 * five-line optimized version. Efficient for (quite) small data sets, much like
	 * other quadratic sorting algorithms. More efficient in practice than most
	 * other simple quadratic (i.e., O(n2)) algorithms such as selection sort or
	 * bubble sort. Adaptive, i.e., efficient for data sets that are already
	 * substantially sorted: the time complexity is O(nk) when each element in the
	 * input is no more than k places away from its sorted position. Stable; i.e.,
	 * does not change the relative order of elements with equal keys. In-place;
	 * i.e., only requires a constant amount O(1) of additional memory space.
	 * Online; i.e., can sort a list as it receives it. The Logic: Insertion sort
	 * iterates, consuming one input element each repetition, and growing a sorted
	 * output list. At each iteration, insertion sort removes one element from the
	 * input data, finds the location it belongs within the sorted list, and inserts
	 * it there. It repeats until no input elements remain.
	 * 
	 * The best case input is an array that is already sorted. In this case
	 * insertion sort has a linear running time (i.e., O(n)). During each iteration,
	 * the first remaining element of the input is only compared with the right-most
	 * element of the sorted subsection of the array.
	 * 
	 * The simplest worst case input is an array sorted in reverse order. The set of
	 * all worst case inputs consists of all arrays where each element is the
	 * smallest or second-smallest of the elements before it. In these cases every
	 * iteration of the inner loop will scan and shift the entire sorted subsection
	 * of the array before inserting the next element. This gives insertion sort a
	 * quadratic running time (i.e., O(n2)).
	 * 
	 */    public static int[] IS(int[] input)
	 {
        
        int temp;
        for (int i = 1; i < input.length; i++) 
        { 
        	for(int j = i ; j > 0 ; j--)
        	{
                if(input[j] < input[j-1])
                {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
    
	public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = IS(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
