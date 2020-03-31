package com.bookStore.demo.model;

import java.util.UUID;

public class Student {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String course;
     public Student(UUID id, String firstName, String lastName, Integer age, String course){
         this.id = id;
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.course = course;
     }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}
