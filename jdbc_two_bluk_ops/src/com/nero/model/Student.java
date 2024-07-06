package com.nero.model;

public class Student {
	private int sid;
	private String sname;
	private String email;
	
	public Student() {
		
	}
	
	public Student(int sid, String sname , String email) {
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + "]";
	}
	
	
	
	
}
