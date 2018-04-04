package edu.handong.csee.java.lab07.prob3; //The file is in this package

/**
 * this class have 3 variable (name, grade,id,missed)
 * can set or reset the variables.
 * for each variable, there are Getter and Setter method
 * can print result if student is failed or not.
 */
public class Attendance { //declare Attendance public type
	String name; //declare class variable String type
	int grade; //declare class variable integer type
	int id; //declare class variable integer type
	int missed; //declare class variable integer type
	public Attendance(String name, int grade, int id, int missed) //method help set variables.
	{
		this.name = name; //put value into class name variable 
		this.grade = grade; //put value into class grade variable 
		this.id = id; //put value into class id variable 
		this.missed = missed; //put value into class missed variable 
	}
	public Attendance() //method help initializing variables.
	{
		this.name = ""; //initializing name
		this.grade = 0; //initializing grade
		this.id = 0; //initializing id
		this.missed =0; //initializing missed
	}
	public String GetName() { //getter method of name
		return name; //return value of name
	}
	public void SetName(String name) { //setter method of name
		this.name = name; //set name
	}
	public int GetGrade() { //getter method of name
		return grade; //return value of grade
	}
	public void SetGrade(int grade) { //setter method of name
		this.grade = grade; //set grade
	}
	public int GetId() { //getter method of name
		return id; //return value of id
	}
	public void SetId(int id) { //setter method of name
		this.id = id; //set id
	}
	public int GetMissed() { //getter method of name
		return missed; //return value of missed
	}
	public void SetMissed(int missed) { //setter method of name
		this.missed = missed; //set missed
	}
	
	public void Print_result() //method printing result
	{
		if(this.missed>6) //if missed class variable is bigger than six,
			System.out.println("I'm sorry, " + this.name +". You failed this course. the number of missed class is " + this.missed); //print this sentence
		else //or not,
			System.out.println(this.name + ", the number of missed class is " + this.missed + ". we will see about the grade."); //print this sentence
	}

}
