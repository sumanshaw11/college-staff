package com.college.staff.controller;

import com.college.staff.model.Student;
import com.college.staff.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService1 studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){

        Student student = studentService.getStudentById(id);

        return new ResponseEntity<>(student, HttpStatus.OK);

    }
}
