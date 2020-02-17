package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static void printStudentsInCourse(List<Student> students, Course course) {
        System.out.println(String.format("Students enrolled in %s:", course.getName()));
        List<Student> enrolled = course.studentsEnrolled(students);
        for (Student student : enrolled) {
            System.out.println(String.format("%s %s", student.getName(), student.getSurname()));
        }
        if (enrolled.size() == 0) {
            System.out.println("none");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Map<String, Course> courses = new HashMap<>();
        courses.put("SE", new Course("Software Engineering"));
        courses.put("AP", new Course("Advanced Programming"));
        courses.put("WT", new Course("Web Technologies"));

        Map<String, Student> students = new HashMap<>();
        students.put("Roxana", new Student("Roxana", "Cernat", "cernatroxana@gmail.com"));
        students.put("Tudor", new Student("Tudor", "Iacobescu", "tudor.iacobescu.1@gmail.com"));
        students.put("Alex", new Student("Alex", "Cambose", "alex.cambose@gmail.com"));
        students.put("Laura", new Student("Laura", "Cornei", "laura@gmail.com"));
        List<Student> studentList = new ArrayList<>(students.values());

        Map<String, Professor> professors = new HashMap<>();
        professors.put("Florin", new Professor("Florin", "Olariu", "florin.olariu@info.uaic.ro"));

        professors.get("Florin").addCourse(courses.get("SE"));
        students.get("Roxana").enroll(courses.get("SE"));
        students.get("Alex").enroll(courses.get("SE"));
        students.get("Laura").enroll(courses.get("SE"));
        students.get("Tudor").enroll(courses.get("WT"));

        for (Course course : courses.values()) {
            printStudentsInCourse(studentList, course);
        }
    }
}
