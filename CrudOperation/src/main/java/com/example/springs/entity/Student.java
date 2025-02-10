package com.example.springs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int RollNo;
	private String Name;
	private String Department;
	
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", Department=" + Department + "]";
	}
	
	public Student(int rollNo, String name, String department) {
		super();
		RollNo = rollNo;
		Name = name;
		Department = department;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
}
