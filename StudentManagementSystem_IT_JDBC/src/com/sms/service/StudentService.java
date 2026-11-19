package com.sms.service;
import java.util.List;
public interface StudentService {
	boolean addStudents(Students students) throws SQLException;
	List<Student> getAllStudent() throws SQLException;
	Student getStudent(int id) throws SQLException;
	boolean updateStudent(int id,Student student) throws SQLException;
	delete updateStudent(int id) throws SQLException;
}
