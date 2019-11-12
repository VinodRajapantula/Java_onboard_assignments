package com.epam.staticblocktest;

public class Test {
	
	public Test(){
    	System.out.println("Default constractor");
    }
	
	// static block 
    static { 
        System.out.println("Inside static block"); 
    }
	
	// static variable 
    static int a = m1(); 
      
    
    // static method 
    static int m1() { 
        System.out.println("from m1"); 
        return 20; 
        
    } 
      
    // static method(main !!) 
    public static void main(String[] args)     
    { 
       Test test = new Test();
       System.out.println("Value of a : "+a); 
       System.out.println("from main"); 
    } 

}
