package com.university.model;

import java.util.Objects;

public class Course {
    private int id;
    private String title;
    private int credits;

    public Course() {}

    public Course(String title, int credits) {
        this.title = title;
        this.credits = credits;
    }

    public Course(int id, String title, int credits) {
        this.id = id;
        this.title = title;
        this.credits = credits;
    }

    // getters/setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "Course{" + id + ", '" + title + '\'' + ", credits=" + credits + '}';
    }
}
