package com.university.controller;

import com.university.model.Course;
import com.university.model.Student;
import com.university.service.UniversityService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final UniversityService service = new UniversityService();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("University Course Registration System (Console)");
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose: ");
            try {
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        addCourse();
                        break;
                    case 3:
                        registerStudent();
                        break;
                    case 4:
                        viewAllStudentsWithCourses();
                        break;
                    case 5:
                        searchCoursesByCredits();
                        break;
                    case 6:
                        studentsInCourse();
                        break;
                    case 7:
                        sortStudents();
                        break;
                    case 8:
                        totalCreditsPerStudent();
                        break;
                    case 9:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }

    private static void printMenu() {
        System.out.println("\n1. Add Student");
        System.out.println("2. Add Course");
        System.out.println("3. Register Student for Course");
        System.out.println("4. View All Students with Registered Courses");
        System.out.println("5. Search Courses by Minimum Credits");
        System.out.println("6. Get Students Registered in a Particular Course");
        System.out.println("7. Sort Students by Year then Name");
        System.out.println("8. Calculate Total Credits Per Student");
        System.out.println("9. Exit");
    }

    private static void addStudent() {
        String name = readLine("Student name: ");
        int year = readInt("Year (e.g. 1,2,3): ");
        Student s = new Student(name, year);
        Student created = service.addStudent(s);
        if (created != null) System.out.println("Created student: " + created);
        else System.out.println("Failed to create student.");
    }

    private static void addCourse() {
        String title = readLine("Course title: ");
        int credits = readInt("Credits: ");
        Course c = new Course(title, credits);
        Course created = service.addCourse(c);
        if (created != null) System.out.println("Created course: " + created);
        else System.out.println("Failed to create course.");
    }

    private static void registerStudent() {
        System.out.println("Students:");
        service.getAllStudents().forEach(System.out::println);
        int sid = readInt("Student ID to register: ");
        System.out.println("Courses:");
        service.getAllCourses().forEach(System.out::println);
        int cid = readInt("Course ID to register for: ");
        boolean ok = service.registerStudentToCourse(sid, cid);
        if (ok) System.out.println("Registration successful.");
        else System.out.println("Registration failed (maybe already registered).");
    }

    private static void viewAllStudentsWithCourses() {
        Map<Student, List<Course>> map = service.getStudentsWithRegisteredCourses();
        map.forEach((student, courses) -> {
            System.out.println(student);
            if (courses == null || courses.isEmpty()) {
                System.out.println("   No registered courses.");
            } else {
                courses.forEach(c -> System.out.println("   " + c));
            }
        });
    }

    private static void searchCoursesByCredits() {
        int min = readInt("Minimum credits: ");
        List<Course> list = service.searchCoursesByMinCredits(min);
        if (list.isEmpty()) System.out.println("No courses found.");
        else list.forEach(System.out::println);
    }

    private static void studentsInCourse() {
        System.out.println("Courses:");
        service.getAllCourses().forEach(System.out::println);
        int cid = readInt("Course ID: ");
        List<Student> students = service.getStudentsInCourse(cid);
        if (students.isEmpty()) System.out.println("No students registered.");
        else students.forEach(System.out::println);
    }

    private static void sortStudents() {
        System.out.println("Sorted students:");
        service.getStudentsSortedByYearThenName().forEach(System.out::println);
    }

    private static void totalCreditsPerStudent() {
        Map<com.university.model.Student, Integer> totals = service.calculateTotalCreditsPerStudent();
        // ensure all students appear (0 credit if none)
        service.getAllStudents().forEach(s -> totals.putIfAbsent(s, 0));
        totals.forEach((student, total) -> System.out.println(student + " -> total credits: " + total));
    }

    // small input helpers
    private static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
}
