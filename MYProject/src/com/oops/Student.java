package com.oops;

public class Student {
	private int sid;
	private String sname;
	private float marks;

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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			this.marks = 0;
		}
	}
}
