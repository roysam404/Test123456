package com.SamplePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordSearcher {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
    	
    	//Method 1
 
        String text = "My Name Is Samir MY NAME IS SAMIR my name is samir";
 
        List<String> list = Arrays.asList(text.split(" "));
 
        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
        
        
        // Method 2
        String input = "Java is a programming language. Python IS also a programming language.";
        // Converting given String to lowerCase
        input = input.toLowerCase();
        /* Split the Input String into words using 
        built-in split() method */
        String[] strArray = input.split(" ");
        /* Declare List of String that will 
        contain repeated words*/
        List<String> repeatedWords = new ArrayList<>();
        /* Declare HashSet of String that will 
        contain unique words */
        HashSet<String> uniqueWords1 = new HashSet<>();
        for(String str : strArray)
        {
            if (!uniqueWords1.add(str))
              repeatedWords.add(str);
        }
        System.out.println(repeatedWords);
        System.out.println(uniqueWords1);
      }
    
    
    
    
}
