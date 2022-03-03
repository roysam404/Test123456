package com.SamplePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map.Entry;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		
		//Q1: 
		 String a1 = new String("Sharma is a good player");  
		      String b1 = "Sharma is a good player";  
		    String  c1= "Sharma is a good player";  
		       if(a1 == b1)  
		       {  
		           System.out.println("a == b");  
		       }  
		       else
		       {
		    	   System.out.println("a =! b");  
		       }
		      if(a1.equals(b1))  
		       {  
		           System.out.println("a equals b");  
		 }  
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");

		System.out.println("Iterating Hashmap...");
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(map.get(3));

		
		  LocalDateTime myDateObj = LocalDateTime.now();
		  System.out.println("Before formatting: " + myDateObj); DateTimeFormatter
		  myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		  
		  String formattedDate = myDateObj.format(myFormatObj);
		  System.out.println("After formatting: " + formattedDate);
		  
		  System.out.println(formattedDate.replaceAll("[-: ]", ""));
		  
		  String test = "Hello(how-are.you ?)"; 
		  String outputText =
		  test.replaceAll("[()-. ]+", "");
		  
		  System.out.println(outputText);
		  
		  
		  String a = "Amounat is $100 in US"; System.out.println(a.length());
		  
		  System.out.println(a.length()-a.replaceAll("A", "").length());
		  
		  String[] c=a.split("t"); 
		  for(String arr:c) { 
			  System.out.println(arr); 
			  }
		  
		  System.out.println(a.indexOf("$")); 
		  System.out.println(a.substring(4));
		  
		  
		  
		  //Print the string in reverse
		  System.out.print(" Print the string in reverse \n");
		  for(int i=a.length()-1;i>=0;i--)
			  
		  {
			  
		  System.out.print(a.charAt(i)); }
		  
		  System.out.print(" Print the string in reverse END\n");
		  
		  
		  // Reverse the word
		  
		  String[] b = a.split(" "); 
		  for (int i = b.length - 1; i >= 0; i--) {
		  System.out.println(b[i]); }
		  
		  
		  
		  
		/*
		 * File f = new File("C:\\Test.txt"); FileReader fr =new FileReader(f);
		 * 
		 * 
		 * try { BufferedReader br =new BufferedReader(new FileReader(new
		 * File("C:\\Test.txt"))); br.readLine(); } catch(FileNotFoundException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		 

	}

}
