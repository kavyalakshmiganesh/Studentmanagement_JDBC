
package com.sms;

import java.sql.SQLException;
import com.sms.view.StudentView;
import com.sms.controller;
import com.sms.repository;
import com.sms.service;
import com.sms.view;

public class Main {
    public static void main(String[] args) throws SQLException {

        StudentRepository repository = new StudentRepositoryImpl();

        StudentService service = new StudentServiceImpl(repository);

        StudentController controller = new StudentController(service);

        StudentView view = new StudentView(controller);

        view.start();
    }
}