package com.SamplePackage;

class Abc
{
    public void Message()
    {
        System.out.println("Abc");  
    }
    
    public void sample() {
    	System.out.println("Sample base");  
    }
    
    public void demo() {
    	System.out.println("Demo");
    }
}

class pqr extends Abc
{
	 @Override
    public void Message()
    {
        System.out.println("pqr");  
    }  
    
    @Override
    public void sample() {
    	System.out.println("Sample child");  
    }
}

class Test123
{
    public static void main (String [] ars)
    {
        Abc a = new Abc();  
        a.Message();
        a.sample();
        
        
        Abc b = new pqr();
        b.Message();
        b.sample();
        
        
        pqr c = new pqr();
        c.Message();
        c.sample();
        
        
        
        
//        pqr d =  new Abc();
//        pqr d =  (pqr) a;
        pqr d =  (pqr) b;
        d.Message();
        d.demo();
    }
}
