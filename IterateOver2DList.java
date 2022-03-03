package com.SamplePackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOver2DList {

	
//	Iterating over the list of lists using loop
//    public static <K> void
//    iterateUsingForEach(List<List<K> > listOfLists)
//    {
//  
//        System.out.println("[");
//  
//        for (List<K> list : listOfLists) 
//        {
//            System.out.print("  [");
//  
//            for (K item : list) 
//            {
//                System.out.print("  " + item + ", ");
//            }
//            System.out.println("], ");
//        }
//        System.out.println("]");
//    }
//  
//    // Driver code
//    public static void main(String[] args)
//    {
//  
//        // List of Lists
//        ArrayList<List<Integer> > listOfLists = new ArrayList<List<Integer> >();
//  
//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(5);
//        list1.add(10);
//        listOfLists.add(list1);
//  
//        List<Integer> list2 = new ArrayList<Integer>();
//        list2.add(1);
//        listOfLists.add(list2);
//  
//        List<Integer> list3 = new ArrayList<Integer>();
//        list3.add(20);
//        list3.add(30);
//        list3.add(40);
//        listOfLists.add(list3);
//  
//        // Iterate the 2D list
//        iterateUsingForEach(listOfLists);
//    }
    
//    Iterating over the list of lists using iterator
    
 // Iterate the 2D list using Iterator
    // and print each element
    public static <K> void
    iterateUsingIterator(List<List<K> > listOfLists)
    {
        // Iterator for the 2D list
        Iterator listOfListsIterator = listOfLists.iterator();
  
        System.out.println("[");
        while (listOfListsIterator.hasNext()) 
        {
  
            List<K> list = new ArrayList<K>();
  
            list = (List<K>)listOfListsIterator.next();
  
            // Iterator for list
            Iterator eachListIterator = list.iterator();
  
            System.out.print("  [");
            while (eachListIterator.hasNext()) 
            {
  
                System.out.print("  " + eachListIterator.next() + ", ");
            }
            System.out.println("], ");
        }
        System.out.println("]");
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // List of Lists
        ArrayList<List<Integer> > listOfLists = new ArrayList<List<Integer> >();
  
        // Create N lists one by one
        // and append to the list of lists
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(10);
        listOfLists.add(list1);
  
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        listOfLists.add(list2);
  
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(20);
        list3.add(30);
        list3.add(40);
        listOfLists.add(list3);
  
        // Iterate the 2D list
        iterateUsingIterator(listOfLists);
    }
}
