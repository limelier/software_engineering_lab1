package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> Courses;

    public Student(String name, String surname, String email) {
        super(name, surname, email);
        Courses = new ArrayList<>();
    }
    public void enroll(Course course) {
        Courses.add(course);
    }
    public boolean isEnrolled(Course course) {
        return Courses.contains(course);
    }
}
