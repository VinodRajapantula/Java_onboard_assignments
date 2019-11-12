package com.epam.inheritence;

public class Test {

	public static void main(String[] args) {
			
		Programmer prg1 =  new Programmer(1, "aaaa", 60000, "Java");
		
			System.out.println("eno: " + prg1.getEno());
			System.out.println("name: " + prg1.getEname());
			System.out.println("Salary: " + prg1.getSalary());
			System.out.println("Skill: " + prg1.getSkillSet());
		
	}

}
