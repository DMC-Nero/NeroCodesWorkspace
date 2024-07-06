package com.nero.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.nero.model.Student;
import com.nero.utility.ConnectionFactory;

public class StudentRepository {
	
	// single row insertion operation
	public void saveStudent(Student st) {
		if(st == null) {
			System.out.println("Invalid input");
		}
		
		String sql = "insert into student values(?,?,?)";
		PreparedStatement ps = null;
		
		try {
			ps = ConnectionFactory.getDBConnection().prepareStatement(sql);
			
			ps.setInt(1, st.getSid());
			ps.setString(2, st.getSname());
			ps.setString(3, st.getEmail());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	// updating student
	public void updateStudent(Student newStudentInfo,int sid) {
		if(newStudentInfo == null) {
			System.out.println("Statement cannot be Empty");
		}
		PreparedStatement ps = null;
		String sql = "update student set sid=?, sname=? , email=? where sid=?";
		try {
			ps = ConnectionFactory.getDBConnection().prepareStatement(sql);
			ps.setInt(1, newStudentInfo.getSid());
			ps.setString(2, newStudentInfo.getSname());
			ps.setString(3, newStudentInfo.getEmail());
			ps.setInt(4, sid);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// deleting student by ID
	public void deleteById(int sid) {
		PreparedStatement ps = null;
		String sql = "delete from student where sid=?";
		try {
			ps = ConnectionFactory.getDBConnection().prepareStatement(sql);
			ps.setInt(1, sid);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// delete all
	public void deleteAll() {
		String sql = "delete from student";
		PreparedStatement ps = null;
		
		try {
			ps = ConnectionFactory.getDBConnection().prepareStatement(sql);
			ps.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Bulk operation [ bulk insert ]
	public void saveAll(Student[] students) {
		if(students == null) {
			System.out.println("Invalid number of input");
			return;
		}
		
		String sql = "insert into student values(?,?,?)";
		PreparedStatement ps = null;
		
		try {
			ps = ConnectionFactory.getDBConnection().prepareStatement(sql);
			
			for(Student student : students) {
				ps.setInt(1, student.getSid());
				ps.setString(2, student.getSname());
				ps.setString(3, student.getEmail());
				ps.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// all Students from database
	public LinkedList<Student> getAllStudents() {
		String sql = "select * from student";
		PreparedStatement ps = null;
		LinkedList<Student> larr = new LinkedList<>();
		
		try {
			ps = ConnectionFactory.getDBConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while( rs.next()) {
				int sid = rs.getInt(1);
				String sname = rs.getString(2);
				String email = rs.getString(3);
				larr.add(new Student(sid,sname,email));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return larr;
	}
	
}
