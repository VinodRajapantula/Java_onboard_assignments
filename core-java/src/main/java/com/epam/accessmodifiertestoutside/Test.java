package com.epam.accessmodifiertestoutside;

import com.epam.accessmodifierstest.Modifier;

public class Test extends Modifier {
	public static void main(String[] args) {
		Modifier modifier = new Modifier();
		//System.out.println(modifier.ename); // default can not access ouside the package
		//System.out.println(modifier.salary);
		//modifier.display();//????????? Protected member should be accessed
		
		Test test = new Test();
		test.display();// can be accessed through inheritance
		//test.salary ;//default can not access outside the package
	}

}
