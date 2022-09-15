package com.yash.exception.Task_1;

public class Student {
	
	private int Rollno;
	private String Sname;
	private String Saddress;
	private Results Srobj;
	
	public Results getSrobj() {
		return Srobj;
	}
	public void setSrobj(Results srobj) {
		Srobj = srobj;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Sname=" + Sname + ", Saddress=" + Saddress + ", Srobj=" + Srobj + "]";
	}
	
	
	

}
