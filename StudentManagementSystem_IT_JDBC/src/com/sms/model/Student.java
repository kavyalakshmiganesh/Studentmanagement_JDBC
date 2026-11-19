package com.sms.model;

public class Student {
   private int StudentId;
   private String StudentName;
   private String email;
   private String department;
   private string phoneNumber;
   public Student(int studentId, String studentName, String email, String department, string phoneNumber) {
	super();
	StudentId = studentId;
	StudentName = studentName;
	this.email = email;
	this.department = department;
	this.phoneNumber = phoneNumber;
   }
   public int getStudentId() {
	return StudentId;
   }
   public void setStudentId(int studentId) {
	StudentId = studentId;
   }
   public String getStudentName() {
	return StudentName;
   }
   public void setStudentName(String studentName) {
	StudentName = studentName;
   }
   public String getEmail() {
	return email;
   }
   public void setEmail(String email) {
	this.email = email;
   }
   public String getDepartment() {
	return department;
   }
   public void setDepartment(String department) {
	this.department = department;
   }
   public string getPhoneNumber() {
	return phoneNumber;
   }
   public void setPhoneNumber(string phoneNumber) {
	this.phoneNumber = phoneNumber;
   }
   @Override
   public String toString() {
	return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", email=" + email + ", department="
			+ department + "]";
   }
}
