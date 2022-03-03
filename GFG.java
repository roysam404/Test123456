package com.SamplePackage;

public class GFG {
	
	{
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends
 
    public GFG()
    {
        System.out.println("Default Constructor invoked");
    }
    public GFG(int x)
    {
        System.out.println("Parameterized constructor invoked");
    }
    public static void main(String arr[])
    {
        GFG obj1, obj2;
        obj1 = new GFG();
        obj2 = new GFG(0);
    }

}
