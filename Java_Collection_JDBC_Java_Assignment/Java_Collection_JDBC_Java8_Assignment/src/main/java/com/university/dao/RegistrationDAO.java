package com.university.dao;

import com.university.model.Course;
import com.university.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegistrationDAO {

    public boolean registerStudentToCourse(int studentId, int courseId) {
        String checkSql = "SELECT COUNT(*) FROM registrations WHERE student_id = ? AND course_id = ?";
        String insertSql = "INSERT INTO registrations (student_id, course_id) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement check = conn.prepareStatement(checkSql)) {
            check.setInt(1, studentId);
            check.setInt(2, courseId);
            try (ResultSet rs = check.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    // already registered
                    return false;
                }
            }
            try (PreparedStatement ps = conn.prepareStatement(insertSql)) {
                ps.setInt(1, studentId);
                ps.setInt(2, courseId);
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Returns a list of registration records created by using a JOIN.
     * Each row represents a student + (possibly null) course.
     */
    public List<RegistrationRecord> getAllStudentCoursePairs() {
        String sql = "SELECT s.student_id, s.name, s.year, c.course_id, c.title, c.credits " +
                     "FROM students s " +
                     "LEFT JOIN registrations r ON s.student_id = r.student_id " +
                     "LEFT JOIN courses c ON r.course_id = c.course_id " +
                     "ORDER BY s.student_id";
        List<RegistrationRecord> out = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Student s = new Student(rs.getInt("student_id"), rs.getString("name"), rs.getInt("year"));
                int courseId = rs.getInt("course_id");
                Course c = null;
                if (!rs.wasNull()) {
                    c = new Course(courseId, rs.getString("title"), rs.getInt("credits"));
                }
                out.add(new RegistrationRecord(s, c));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return out;
    }
}
