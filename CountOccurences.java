package com.SamplePackage;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
	

    public static void main(String[] args)
    {
        String str = "Appaale1212*)($#@%";
        str=str.toLowerCase(); // if we want to ignore case
        
        for(int i=0;i<str.length();i++)
        {
//        	System.out.println(str.charAt(i));
        	
        }
        String c=characterCount(str);
        
        System.out.println(c);
        
        
        
    }

	
	static String characterCount(String inputString)
    {
		String ch="A";
       
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
        char[] strArray = inputString.toCharArray();
  
       
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
  
       
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
  
                charCountMap.put(c, 1);
            }
        }
  
        
//        System.out.println(charCountMap);
       
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		return ch;
    }
  
}
