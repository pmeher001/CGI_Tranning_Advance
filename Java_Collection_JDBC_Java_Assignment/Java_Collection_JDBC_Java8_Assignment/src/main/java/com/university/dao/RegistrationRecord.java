package com.university.dao;

import com.university.model.Course;
import com.university.model.Student;

public class RegistrationRecord {
    private Student student;
    private Course course; // can be null when student has no courses

    public RegistrationRecord(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
}
