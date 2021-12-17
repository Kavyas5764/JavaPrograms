package com.demo.springprogs;

public class Student {
	String Stuname,roll;

	public String getName() {
		return Stuname;
	}

	public void setName(String Stuname) {
		this.Stuname = Stuname;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}
	void display() {
		System.out.println("Name:"+Stuname+" Rollno:"+roll);
		
	}

}
