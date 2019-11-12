package com.epam.clone;

public class A implements Cloneable{
	
	public Object clone() throws CloneNotSupportedException{  
		return super.clone();  
	}

}
