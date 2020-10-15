package com.college.staff.service;

import com.college.staff.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudentById(int id) {

        return Student.builder().id(id).name("Suman Agarwal").build();

    }
}
