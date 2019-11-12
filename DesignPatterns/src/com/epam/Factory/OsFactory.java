package com.epam.Factory;

public class OsFactory {
	
	public OS getInstance(String osName){
		if (osName.equalsIgnoreCase("Android")){
			return new Android();
		}else if(osName.equalsIgnoreCase("Ios")){
			return  new Ios();
		} else {
			return new Windows();
		}
		
	}

}
