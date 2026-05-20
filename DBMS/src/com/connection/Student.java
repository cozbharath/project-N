package com.connection;

public class Student {
	private int stno;
	private String stname;
	private String course;
	private int marks;

	public Student() {

	}

	public Student(int stno, String stname, String course, int marks) {
		this.stno = stno;
		this.stname = stname;
		this.course = course;
		this.marks = marks;
	}

	public int getStno() {
		return stno;
	}

	public void setStno(int stno) {
		this.stno = stno;
	}

	public String getStname() {
		return stname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
