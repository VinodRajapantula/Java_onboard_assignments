package com.epam.clone;



public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton(){		
	}
	
	public void hello(){
		System.out.println("this is hello from singleton");
	}
	
	public static Singleton getSingletonObj(){
		if (singleton == null){
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	

}

