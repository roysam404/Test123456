package com.SamplePackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class JavaHungry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given below Input String containing duplicate words

		//int a[] = {5,2,2,6,8,6,7,5,2,8};

		// Function call
		// removeDuplicates(a);
		//input = input.toLowerCase();
		String input = "MY NAME IS is SAMIR in Selenium My Name Is Samir in Cucumber my name is samir in Java";

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		String[] words = input.split(" ");
		int length = words.length;
		// Using for loop 
		for( int i=0; i < length; i++)
		{
			set.add(words[i]);
			// Set count to 1 for every iteration
			int count = 1;
			for(int j=i+1; j < length; j++)
			{	

				if(words[i].equalsIgnoreCase(words[j]))
				{
					count++;
					words[j] = "0";
				}
			}


			if (words[i] != "0" && count > 0 )
				System.out.print(" "+words[i]+" " +count);

		}
		
		
		
		//String[] arr = new String[] { "This", "is", "gasd", "SFDK", "HSGH", "tSADF", "EASDSA" };
		String abc= " My Name is Sai";
		String[] arr = abc.trim().split(" ");
		
	      List<String>list = Arrays.asList(arr);
	      System.out.println("List = "+list);
	      Collections.sort(list);
	      
	      System.out.println("Case Sensitive Sort = "+list);
	      Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
	      System.out.println("Case Insensitive Sort = "+list);


	}
}





