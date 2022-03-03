package com.SamplePackage;

import java.util.ArrayList;
import java.util.Collections;

public class MissingNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1,0,3,2,4,5,6,7,8,9,10};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		int sum = 0;
		System.out.println(a.length);
		for(int i = 0; i<a.length; i++){
			al.add(a[i]);
			sum = sum + a[i]; //49
		}
		
		Collections.sort(al);
		System.out.println("Collection after Sorting: "+al);
		System.out.println(sum);
		
		int sum1 = 0;
		for(int j=-1; j<=10; j++){
			sum1 = sum1 + j;//55
		}
		
		System.out.println(sum1);
		
		System.out.println("missing number is:::"+ (sum1-sum));
		
		
		
		String s = "å°�ç±³ä½“éªŒç‰ˆ latin string 01234567890";
		String s1 = "@#$@#$@ testing #@$@#$@#$ Selenium !@#$@#$@# &&&& Java";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
