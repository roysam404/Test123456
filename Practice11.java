package com.SamplePackage;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
        //String str = scanner.next();
		String str="AABBBCCAACC";
        int count;
        for(int i = 0;i<str.length();i++){
          count = 1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                i++;
                count++;
            }
            System.out.print(str.charAt(i)+""+count+" ");
        }
        
        
        String str1="GGG";
        String str2=new String("GGG1");
        
        System.out.println(str1==str1);
        System.out.println(str1.equals(str2));
        
	}

}
