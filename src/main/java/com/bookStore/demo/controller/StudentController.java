package com.bookStore.demo.controller;

import com.bookStore.demo.model.Student;
import com.bookStore.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping( method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void inserNewStudent(@RequestBody Student new_student){
        UUID studentId = UUID.randomUUID();

        studentService.insertStudent(studentId,new_student);
    }

    @RequestMapping(method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    path = "{studentId}")
    public Student getStudentById(@PathVariable("studentId") UUID studentId){
        return studentService.getStudentById(studentId);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
           path = "{studentId}")
    public void deleteStudentById(@PathVariable("studentId") UUID studentId){
        studentService.removeStudentById(studentId);
    }
}
