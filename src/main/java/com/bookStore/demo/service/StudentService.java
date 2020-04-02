package com.bookStore.demo.service;

import com.bookStore.demo.model.Student;
import com.bookStore.demo.studentDao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    private StudentDao studentDao;
    @Autowired
    public StudentService(@Qualifier("DaoImp") StudentDao studentDao){
        this.studentDao = studentDao;

    }
    public int insertStudent(UUID id, Student newStudent){
        UUID studentUid = id == null ? UUID.randomUUID() : id;
        newStudent.setId(id);
        return studentDao.insertStudent(studentUid,newStudent);

    }
    public Student getStudentById(UUID given_id){
        return studentDao.getStudentById(given_id);
    }
    public List<Student> getAllStudent(){
        return studentDao.getAllStudent();
    }
    public int updateStudentById(UUID id,Student newStudent){

        return studentDao.updateStudentById(id,newStudent);
    }
    public int removeStudentById(UUID id){
        return  studentDao.removeStudentById(id);
    }
}
