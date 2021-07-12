package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Azhagu Subashini");

	}
	
	public void studentDept() {
		Student stu = new Student();
		stu.deptName();

	}
	public void studentId() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.collegeCode();
		stu1.collegeName();
		stu1.collegeRank();
		stu1.studentDept();
		stu1.studentId();
		stu1.studentName();
		
		
		
		

	}

}
