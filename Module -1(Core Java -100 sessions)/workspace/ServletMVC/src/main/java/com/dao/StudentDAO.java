package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.dbutil.DBConnection;
import com.model.Student;

public class StudentDAO {
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	Connection dbCon;
	
	public StudentDAO() {
		dbCon = DBConnection.getConnection();
	} 
	
	public int addStudent(Student std) {
		int count = 0;
		try {
			ps = dbCon.prepareStatement("INSERT INTO STUDENT (REGNO,STUDENT_NAME,DEP,AGE,GENDER,DOB) VALUES(?,?,?,?,?,?)");;
			
			ps.setInt(1, std.getRegno());
			ps.setString(2, std.getStudent_name());
			ps.setString(3, std.getDept());
			ps.setInt(4, std.getAge());
			ps.setString(5, std.getGender());
			ps.setDate(6, new java.sql.Date(std.getDob().getTime()));
			
			count  = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	/**
	 * 
	 * @return ArrayList<Student>
	 */
	public ArrayList<Student> getAllStudentDetails() {
		ArrayList<Student> students = new ArrayList<>();
		try {
			stmt = dbCon.createStatement();
			rs = stmt.executeQuery("SELECT * FROM STUDENT");
			while(rs.next()) {
				Student stud = new Student();
				stud.setRegno(rs.getInt("regno"));
				stud.setStudent_name(rs.getString("student_name"));
				stud.setDept(rs.getString("dep"));
				stud.setAge(rs.getInt("age"));
				stud.setGender(rs.getString("gender"));
				stud.setDob(rs.getDate("dob"));
				
				students.add(stud);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return students;
	}

	/**
	 * 
	 * @param regno
	 * @return
	 */
	public ArrayList<Student> getStudentByRegno(int regno) {
		ArrayList<Student> students = new ArrayList<>();
		try {
			stmt = dbCon.createStatement();
			rs = stmt.executeQuery("SELECT * FROM STUDENT WHERE REGNO = "+regno);
			while(rs.next()) {
				Student stud = new Student();
				stud.setRegno(rs.getInt("regno"));
				stud.setStudent_name(rs.getString("student_name"));
				stud.setDept(rs.getString("dep"));
				stud.setAge(rs.getInt("age"));
				stud.setGender(rs.getString("gender"));
				stud.setDob(rs.getDate("dob"));

				students.add(stud);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

	public int updateStudent(Student std) {
		int count = 0;
		try {
			ps = dbCon.prepareStatement("UPDATE STUDENT SET STUDENT_NAME = ?, DEP = ?, AGE = ?, GENDER = ?, DOB = ? WHERE REGNO=?");;
			
			ps.setString(1, std.getStudent_name());
			ps.setString(2, std.getDept());
			ps.setInt(3, std.getAge());
			ps.setString(4, std.getGender());
			ps.setDate(5, new java.sql.Date(std.getDob().getTime()));
			ps.setInt(6, std.getRegno());
			
			System.out.println(ps.toString());
			count  = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public int deleteStudent(int regno) {
		int count =0;
		try {
			PreparedStatement ps = dbCon.prepareStatement("DELETE FROM STUDENT WHERE REGNO=?");
			ps.setInt(1, regno);
			ps.toString();
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
