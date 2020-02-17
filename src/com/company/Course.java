package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String Name;

    public Course(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public List<Student> studentsEnrolled(List<Student> students) {
        List<Student> enrolled = new ArrayList<>();
        for (Student student : students) {
            if (student.isEnrolled(this)) {
                enrolled.add(student);
            }
        }
        return enrolled;
    }
}
