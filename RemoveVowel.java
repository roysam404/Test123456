package com.SamplePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class RemoveVowel {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
         //String str = scanner.nextLine();
    	String str="Aacommitment";
         List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
         char c[] = str.toCharArray();
         StringBuffer sb = new StringBuffer();
         for(Character newchar : c ){
             if(!list.contains(newchar)){
                 sb.append(newchar);
             }
         }
        System.out.println(sb);
    }
}
