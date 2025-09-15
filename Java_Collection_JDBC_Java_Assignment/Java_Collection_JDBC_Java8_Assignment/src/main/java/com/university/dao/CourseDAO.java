package com.university.dao;

import com.university.model.Course;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public Course addCourse(Course course) {
        String sql = "INSERT INTO courses (title, credits) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, course.getTitle());
            ps.setInt(2, course.getCredits());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) course.setId(rs.getInt(1));
            }
            return course;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Course> getAllCourses() {
        String sql = "SELECT course_id, title, credits FROM courses";
        List<Course> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Course(rs.getInt("course_id"), rs.getString("title"), rs.getInt("credits")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Course getCourseById(int id) {
        String sql = "SELECT course_id, title, credits FROM courses WHERE course_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return new Course(rs.getInt("course_id"), rs.getString("title"), rs.getInt("credits"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
