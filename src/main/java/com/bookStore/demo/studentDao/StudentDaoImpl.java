package com.bookStore.demo.studentDao;

import com.bookStore.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("DaoImp")
public class StudentDaoImpl implements StudentDao
{
    private final Map<UUID,Student> database;
    public StudentDaoImpl()
    {
        database = new HashMap<>();
        UUID studentId = UUID.randomUUID();
        database.put(studentId,new Student(studentId,"Adilet","Momunaliev",32,"LinearAlgebra"));
    }
    @Override
    public int insertStudent(UUID id, Student newStudent)
    {
        database.put(id,newStudent);
        return 1;
    }
    @Override
    public Student getStudentById(UUID given_id)
    {
        for(int idx=0; idx<database.size(); idx++){
            if(database.containsKey(given_id)){
                Student student = database.get(given_id);
                return student;
            }
        }
        return null;
    }
    @Override
    public List<Student> getAllStudent()
    {
            List<Student> students = new LinkedList<Student>();
            for(UUID key: database.keySet()){
                Student student = database.get(key);
                students.add(student);
            }
            return students;
    }
    @Override
    public int updateStudentById(UUID id,Student newStudent)
    {
        for(UUID key: database.keySet()){
            if(key.equals(id)){
                database.remove(id);
                database.put(id,newStudent);
                return 1;
            }
        }
        return -1;

    }
    @Override
    public int removeStudentById(UUID id)
    {
        for(UUID key: database.keySet()){
            if(key.equals(id)){
                database.remove(id);
                return 1;
            }
        }
        return -1;
    }

}
