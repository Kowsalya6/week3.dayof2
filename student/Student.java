package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("This is my studentName");
	}
	public void studentDept()
	{
		System.out.println("This is my studentDept");
	}
	public void studentId()
	{
		System.out.println("This is my studentId");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	    	}

} 
