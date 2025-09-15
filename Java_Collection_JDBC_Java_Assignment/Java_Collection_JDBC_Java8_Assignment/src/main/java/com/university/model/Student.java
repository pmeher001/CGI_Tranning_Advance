package com.university.model;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int year;

    public Student() {}

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Student(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    // getters/setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "Student{" + id + ", '" + name + '\'' + ", year=" + year + '}';
    }
}
