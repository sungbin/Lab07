package edu.handong.csee.java.lab07.prob2; //The file is in this package

/**
 * This class have 3 variable (name, price, stars)
 * Set_functions help input value to variables.
 * Get_functions help output value of variables.
 * making instance, get or set variable value.
 */
public class Chicken { //declare Chicken class
	public String name; //declare name variable type public String
	public double price; //declare price variable public double type
	public int stars; //declare stars variable public int type
	
	public Chicken(String name, double price, int stars) { //making instance, this function get variable value
		this.name = name; //input value to name class variable
		this.price = price; //input value to price class variable
		this.stars = stars; //input value to stars class variable
	}

	public Chicken() //making instance, this function set variable value.
	{
	this.name = ""; //set class variable, name
	this.price = 0.0; //set class variable, price
	this.stars = 0; //set class variable, stars
	}
	
	public void Set_name(String name) //declare Set_name function public type that input value from user to class variable
	{
		this.name = name; //input the value to name class variable
	}
	public void Set_price(double price) //declare function public type that input value from user to class variable
	{
		this.price = price; //input the value to price class variable
	}
	public void Set_stars(int stars) //declare function public type that input value from user to class variable
	{
		this.stars = stars; //input the value to stars class variable
	}
	public String Get_name() //declare Get_name function, return type is String
	{
		return this.name; //return the value
	}
	public double Get_price() //declare Get_price function, return type is double
	{
		return this.price; //return the value
	}
	public int Get_stars() //declare Get_stars function, return type is int
	{
		return this.stars; //return the value
	}
}
