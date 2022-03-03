package com.SamplePackage;

public class Singleton {

	private static Singleton SI=new Singleton();
	
	
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return SI;
	}
	
	public void showMessage() {
		System.out.println("demo string");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton x= new Singleton();
		
		Singleton y= Singleton.getInstance();
		y.showMessage();
		
		

	}

}
