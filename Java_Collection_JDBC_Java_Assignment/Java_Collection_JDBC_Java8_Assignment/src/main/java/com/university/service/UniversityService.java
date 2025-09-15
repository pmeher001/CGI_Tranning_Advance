package com.university.service;

import com.university.dao.RegistrationDAO;
import com.university.dao.RegistrationRecord;
import com.university.dao.CourseDAO;
import com.university.dao.StudentDAO;
import com.university.model.Course;
import com.university.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class UniversityService {
    private final StudentDAO studentDAO = new StudentDAO();
    private final CourseDAO courseDAO = new CourseDAO();
    private final RegistrationDAO registrationDAO = new RegistrationDAO();

    // Use DAO join + groupingBy in service
    public Map<Student, List<Course>> getStudentsWithRegisteredCourses() {
        List<RegistrationRecord> pairs = registrationDAO.getAllStudentCoursePairs();

        Map<Student, List<Course>> grouped = pairs.stream()
                .collect(Collectors.groupingBy(
                        RegistrationRecord::getStudent,
                        Collectors.mapping(RegistrationRecord::getCourse, Collectors.toList())
                ));

        // remove null course entries (students with no registrations will have list with single null)
        grouped.forEach((student, courses) -> {
            courses.removeIf(Objects::isNull);
        });

        // ensure students with no entry appear as key with empty list
        List<Student> allStudents = studentDAO.getAllStudents();
        for (Student s : allStudents) {
            grouped.putIfAbsent(s, new ArrayList<>());
        }

        return grouped;
    }

    public List<Course> searchCoursesByMinCredits(int minCredits) {
        return courseDAO.getAllCourses().stream()
                .filter(c -> c.getCredits() >= minCredits)
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsInCourse(int courseId) {
        return registrationDAO.getAllStudentCoursePairs().stream()
                .filter(rr -> rr.getCourse() != null && rr.getCourse().getId() == courseId)
                .map(RegistrationRecord::getStudent)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsSortedByYearThenName() {
        return studentDAO.getAllStudents().stream()
                .sorted(Comparator.comparingInt(Student::getYear).thenComparing(Student::getName))
                .collect(Collectors.toList());
    }

    public Map<Student, Integer> calculateTotalCreditsPerStudent() {
        // group by Student -> sum of credits
        return registrationDAO.getAllStudentCoursePairs().stream()
                .filter(rr -> rr.getCourse() != null)
                .collect(Collectors.groupingBy(
                        RegistrationRecord::getStudent,
                        Collectors.summingInt(rr -> rr.getCourse().getCredits())
                ));
    }

    // helper creation methods that delegate to DAO
    public Student addStudent(Student s) { return studentDAO.addStudent(s); }
    public Course addCourse(Course c) { return courseDAO.addCourse(c); }
    public boolean registerStudentToCourse(int studentId, int courseId) {
        return registrationDAO.registerStudentToCourse(studentId, courseId);
    }

    public List<Student> getAllStudents() { return studentDAO.getAllStudents(); }
    public List<Course> getAllCourses() { return courseDAO.getAllCourses(); }
}
