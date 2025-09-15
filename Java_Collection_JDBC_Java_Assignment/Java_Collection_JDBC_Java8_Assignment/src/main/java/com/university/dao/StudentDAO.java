package com.university.dao;

import com.university.model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public Student addStudent(Student student) {
        String sql = "INSERT INTO students (name, year) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, student.getName());
            ps.setInt(2, student.getYear());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) student.setId(rs.getInt(1));
            }
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT student_id, name, year FROM students";
        List<Student> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Student(rs.getInt("student_id"), rs.getString("name"), rs.getInt("year")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Student getStudentById(int id) {
        String sql = "SELECT student_id, name, year FROM students WHERE student_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return new Student(rs.getInt("student_id"), rs.getString("name"), rs.getInt("year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
