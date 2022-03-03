package com.SamplePackage;

import java.util.HashSet;
import java.util.Set;

public class VowelFinder {

	
	public static void main(String args[])
    {
       
        String str = "hgjh;hje12iooofd12u";
 
        Set<Character> set=new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(isVowel(c))
            {
                set.add(c);
            }
        }
 
        System.out.println("Vowels are:");
        for (Character c:set) {
            System.out.print(" "+c);
        }
 

    }
 
    public static boolean isVowel(char character)
    {
 
        if(character=='a' || character=='A' || character=='e' || character=='E' ||
                character=='i' || character=='I' || character=='o' || character=='O' ||
                character=='u' || character=='U'){
            return true;
        }else{
            return false;
        }
    }
}
