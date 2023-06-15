package com.syntexpro.java.training.constructor;

public class Students {
    public String name;

    public int age;

    public int studentsId;


    public Students(String studentsName) {
        this.name = studentsName;
    }

    public Students(String studentName, int studentAge) {
        this.name= studentName;
        this.age= studentAge;
    }

    public Students(String studentName, int studentAge, int studentId) {
        this.name = studentName;
        this.age = studentAge;
        this.studentsId = studentId;
    }






    }

