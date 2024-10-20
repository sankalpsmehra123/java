package com.javaforfun.model;

public class Student {

    private String name;
    private int studentId;
    
    public Student() {
    }
    
    public String getName() {
        return name;
    }
    
    public Student setName(String name) {
        this.name = name;
        return this;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public Student setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", studentId=" + studentId + "]";
    }
}
