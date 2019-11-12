package com.epam.inheritence;

public class Programmer extends Employee{
	private String skillSet;
	
	
	public Programmer(int eno, String ename, int salary,String skillSet) {
		super(eno, ename, salary);
		this.skillSet = skillSet;
	}


	public String getSkillSet() {
		return skillSet;
	}


	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
	
	

}
