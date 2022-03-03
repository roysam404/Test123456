package com.SamplePackage;

public class QuickSort {
	
	/*
	 * Quicksort is a comparison sort, meaning that it can sort items of any type
	 * for which a “less-than” relation (formally, a total order) is defined. In
	 * efficient implementations it is not a stable sort, meaning that the relative
	 * order of equal sort items is not preserved. Quicksort can operate in-place on
	 * an array, requiring small additional amounts of memory to perform the
	 * sorting. It is very similar to selection sort, except that it does not always
	 * choose worst-case partition.
	 * 
	 * Mathematical analysis of quicksort shows that, on average, the algorithm
	 * takes O(n log n) comparisons to sort n items. In the worst case, it makes
	 * O(n2) comparisons, though this behavior is rare.
	 * 
	 */	 private int array[];
	    private int length;
	 
	    public void sort(int[] inputArr) {
	         
	        if (inputArr == null || inputArr.length == 0) {
	            return;
	        }
	        this.array = inputArr;
	        length = inputArr.length;
	        quickSort(0, length - 1);
	    }
	 
	    private void quickSort(int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	            while (array[i] < pivot) { i++; } while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	 
	    private void exchangeNumbers(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	     
	    public static void main(String a[]){
	         
	        QuickSort sorter = new QuickSort();
	        int[] input = {24,2,-10,45,20,0,56,75,2,56,-90,99,53,12};
	        sorter.sort(input);
	        for(int i:input){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
}
