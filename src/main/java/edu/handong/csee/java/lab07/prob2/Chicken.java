package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	public String name;
	public double price;
	public int stars;
	


	public Chicken(String name, double price, int stars) {
		this.name = name;
		this.price = price;
		this.stars = stars;
	}

	public Chicken()
	{
	this.name = "";
	this.price = 0.0;
	this.stars = 0;
	}

	
	public void Set_name(String name)
	{
		this.name = name;
	}
	public void Set_price(double price)
	{
		this.price = price;
	}
	public void Set_stars(int stars)
	{
		this.stars = stars;
	}
	public String Get_name()
	{
		return this.name;
	}
	public double Get_price()
	{
		return this.price;
	}
	public int Get_stars()
	{
		return this.stars;
	}
	
	

}
