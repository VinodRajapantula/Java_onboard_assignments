package com.epam.comparatortest;

public class Student {
	
	protected int sno;
	protected String sname;
	protected int standard;
	
	public Student(int sno, String sname, int standard) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", standard=" + standard + "]";
	}
	
}

