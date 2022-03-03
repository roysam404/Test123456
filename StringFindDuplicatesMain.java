package com.SamplePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class StringFindDuplicatesMain {

	public static void main(String a[]) {  
    	StringFindDuplicatesMain dcf = new StringFindDuplicatesMain();  
        dcf.findIt("India is my country");  
        StringFindDuplicatesMain.countDuplicateCharacters("geeksforgeeks");
        
        
        int []a1 = {10,20,-7,1,76,90};
        dcf.findPairWithMinSumBruteForce(a1);
        
        int array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
        dcf.findPairsWithSumEqualsToXBruteForce(array, 15);
        
        int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) 
        {
         System.out.print(arr[i]+" ");
        }
        arr=separateEvenOddNumbers(arr);
        System.out.println("nArray after separating even and odd numbers : ");
        for (int i = 0; i < arr.length; i++) 
        {
         System.out.print(arr[i]+" ");
        }
    }
	
	
	public void findIt(String str) {  
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (baseMap.containsKey(ch)) {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            } else {  
                baseMap.put(ch, 1);  
            }  
        }  
        Set<Character> keys = baseMap.keySet();  
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }  
    }  
   
    
    
    
    public static void countDuplicateCharacters(String str)
    {
  
        Map<Character, Integer> map = new HashMap<Character, Integer>();
  

        char[] charArray = str.toCharArray();
  
        for (char c : charArray) {
  
            if (map.containsKey(c)) 
            {
                map.put(c, map.get(c) + 1);
            }
            else {
  

                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
  
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : "+ entry.getValue());
            }
        }
    }
    
    
    
    public static void findPairWithMinSumBruteForce(int arr[])
    {
        if(arr.length<2)
            return;
        // Suppose 1st two element has minimum sum
        int minimumSum=arr[0]+arr[1];
        int pair1stIndex=0;
        int pair2ndIndex=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tempSum=arr[i]+arr[j];
                if(Math.abs(tempSum) < Math.abs(minimumSum))
                {
                    pair1stIndex=i;
                    pair2ndIndex=j;
                    minimumSum=tempSum;
                }
            }
        }
        System.out.println(" The pair whose sum is closest to zero : "+arr[pair1stIndex]+" "+ arr[pair2ndIndex]);
    }
    
    
//    Find all pairs of elements from an array whose sum is equal to given number
    public static void findPairsWithSumEqualsToXBruteForce(int arr[], int X) {
        if (arr.length < 2)
            return;
     
        System.out.println("The pair whose sum is equal to 15 using brute force method: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];
     
                if (tempSum == X) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        
        
    }
    
//    Separate odd and even numbers in an array
    
    public static int[] separateEvenOddNumbers(int arr[])
    {
     int left=0;
     int right=arr.length-1;
     for (int i = 0; i < arr.length; i++) {
    
      while(arr[left]%2==0)
      {
       left++;
      }
      while(arr[right]%2==1)
      {
       right--;
      }
    
      if(left<right)
      {
       int temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
      }
     }
     return arr;
    }
}