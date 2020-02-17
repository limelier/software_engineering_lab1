package com.company;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private List<Course> Courses;

    public Professor(String name, String surname, String email) {
        super(name, surname, email);
        Courses = new ArrayList<>();
    }
    public void addCourse(Course course) {
        Courses.add(course);
    }
}
