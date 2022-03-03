package com.SamplePackage;

import java.io.File;

public class RecursivePrint {

	static void RecursivePrint(File[] arr, int level) 
    {
        // for-each loop for main directory files
        for (File f : arr) 
        {
            // tabs for internal levels
            for (int i = 0; i < level; i++)
                System.out.print("\t");
             
            if(f.isFile()) 
                System.out.println(f.getName());
              
            else if(f.isDirectory()) 
            { 
                System.out.println("[" + f.getName() + "]");
              
                // recursion for sub-directories
                RecursivePrint(f.listFiles(), level + 1);
            }
        }
   }
     
   // Driver Method
   public static void main(String[] args)
   {

                 
       // File object
       File maindir = new File("C:\\15 Dump\\Samir Review Utility");
          
       if(maindir.exists() && maindir.isDirectory())
       {
           // array for files and sub-directories 
           // of directory pointed by maindir
           File arr[] = maindir.listFiles();
             
           System.out.println("**********************************************");
           System.out.println("Files from main directory : " + maindir);
           System.out.println("**********************************************");
             
           // Calling recursive method
           RecursivePrint(arr, 0); 
      } 
   }
}
