package com.sms.controller;

public class StudentController {
private final StudentService service;
public Studentcontroller(StudentService service) {
	this.service=service;
}
public boolean add(Student student) throws SQLException {
	return service.addStudent(student);
}

public List<Student>getAll() throws SQLException{
	return service.getAllStudents();
	
}
public Student getById(int id) throws SQLException {
	return service.getStudentById(id);
}
public boolean update(int id,Student student) throws SQLException {
	return service.updateStudent(id,student);
	
}
public boolean delete(int id) throws SQLException{
	return service.deleteStudent(id);
}

}
