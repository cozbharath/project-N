package com.connection;

public class Student {
	private int stno;
	private String stname;
	private int marks;
	
	public Student() {
		
	}
	
	public Student(int sno, String stname, int marks) {
		this.stno = stno;
		this.stname = stname;
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
