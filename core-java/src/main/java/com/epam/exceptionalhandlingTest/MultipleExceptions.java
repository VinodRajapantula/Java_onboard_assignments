package com.epam.exceptionalhandlingTest;

public class MultipleExceptions {

	public static void main(String[] args) {
		int a = 1; 
        int b = 0;
        
       
        try{
        	int c[]=new int[5];   
        	
        	int j=a/b;
            for (int i =0;i<=c.length;i++){
            	System.out.println(c[i+1]);
            }
        	
        }catch (ArrayIndexOutOfBoundsException|ArithmeticException  ex) {
			if (ex.getMessage().contains("by zero")){
				System.out.println("Devide by zero");
			}else{
				System.out.println("Array out of bounds");
			}
		}
        
        

	}

}
