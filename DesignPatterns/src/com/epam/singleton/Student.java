package com.epam.singleton;

public class Student {
	private int sno;
	private String sname;
	
	public Student(){
		System.out.println("Student object created");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	
}
