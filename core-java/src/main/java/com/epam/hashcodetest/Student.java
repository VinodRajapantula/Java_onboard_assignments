package com.epam.hashcodetest;

public class Student  {
	

	private int sno;
	private String sname;
	private int standard;
	
	public Student(int sno, String sname, int standard) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.standard = standard;
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

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + sno;
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (sno != other.sno)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", standard=" + standard + "]";
	}

	
	

}
