package edu.handong.csee.java.lab07.prob3;

public class Attendance {
	String name;
	int grade;
	int id;
	int missed;
	public Attendance(String name, int grade, int id, int missed)
	{
		this.name = name;
		this.grade = grade;
		this.id = id;
		this.missed = missed;
	}
	public Attendance()
	{
		this.name = "";
		this.grade = 0;
		this.id = 0;
		this.missed =0;
	}
	public String GetName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public int GetGrade() {
		return grade;
	}
	public void SetGrade(int grade) {
		this.grade = grade;
	}
	public int GetId() {
		return id;
	}
	public void SetId(int id) {
		this.id = id;
	}
	public int GetMissed() {
		return missed;
	}
	public void SetMissed(int missed) {
		this.missed = missed;
	}
	
	public void Print_result()
	{
		if(this.missed>6)
			System.out.println("I'm sorry, " + this.name +". You failed this course. the number of missed class is " + this.missed);
		else
			System.out.println(this.name + ", the number of missed class is " + this.missed + ". we will see about the grade.");
	}

}
