package com.bookStore.demo.studentDao;

import com.bookStore.demo.model.Student;
import  java.util.List;
import java.util.UUID;

public interface StudentDao {
    public int insertStudent(UUID id, Student newStudent);
    public Student getStudentById(UUID given_id);
    public List<Student> getAllStudent();
    public int updateStudentById(UUID id,Student newStudent);
    public int removeStudentById(UUID id);
}
