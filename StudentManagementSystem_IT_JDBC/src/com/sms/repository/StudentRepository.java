package com.sms.repository;

import java.util.List;

public interface StudentRepository {
boolean add(Student student) throws SQLException;
List<Student> findAll(); throws SQLException;
Student findById(int id) throws SQLException;
boolean update(int id, Student student) throws SQLExcepton;
boolean delete(int id) throws SQLException;
}
