package com.bookStore.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {
    private  UUID id;
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String course;
     public Student(@JsonProperty("id") UUID id, @JsonProperty("firstName")String firstName, @JsonProperty("lastName")String lastName, @JsonProperty("age")Integer age, @JsonProperty("course")String course){
         this.id = id;
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
         this.course = course;
     }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id){
         this.id = id;
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
