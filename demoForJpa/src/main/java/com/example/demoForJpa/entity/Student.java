package com.example.demoForJpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long marks;
	private double total;
	private String studentName;
	private String studentEmail;
	private String studentAddress;
	private String studentSubjects;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getStudentSubjects() {
		return studentSubjects;
	}
	public void setStudentSubjects(String studentSubjects) {
		this.studentSubjects = studentSubjects;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	
	
	
	
	/*public Student(long id, String studentName, String studentEmail, String studentAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
	}*/
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, long marks, double total, String studentName, String studentEmail, String studentAddress,
			String studentSubjects) {
		super();
		this.id = id;
		this.marks = marks;
		this.total = total;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
		this.studentSubjects = studentSubjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", total=" + total + ", studentName=" + studentName
				+ ", studentEmail=" + studentEmail + ", studentAddress=" + studentAddress + ", studentSubjects="
				+ studentSubjects + "]";
	}
	
	
	/*@Override
	 * public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentAddress=" + studentAddress + "]";
	}*/
	
	
	

}
