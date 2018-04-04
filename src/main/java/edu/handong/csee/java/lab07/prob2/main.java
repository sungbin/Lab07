package edu.handong.csee.java.lab07.prob2; //The file is in this package

/**
 * main function have 3 instance of chicken class.
 * to operate well, need Chicken functions including setting and saving.
 */
public class main { //declare main class public type

	public static void main(String[] args) { //declare main function
		// TODO Auto-generated method stub
		Chicken menu1 = new Chicken("Cheese_mustard",17000.00,5); //make instance of Chicken
		Chicken menu2 = new Chicken("Honey_mustard",17000.00,5); //make instance of Chicken
		Chicken menu3 = new Chicken("Spicey_chicken",17000.00,5); //make instance of Chicken
		
		menu1.Set_stars(3); //input the value to stars variable in Chicken instance
		menu2.Set_stars(4); //input the value to stars variable in Chicken instance
		menu3.Set_stars(1); //input the value to stars variable in Chicken instance
		
		System.out.println(menu1.name + "'s rating is " + menu1.stars); //print stars variable in menu1 instance
		System.out.println(menu2.name + "'s rating is " + menu2.stars); //print stars variable in menu2 instance
		System.out.println(menu3.name + "'s rating is " + menu3.stars); //print stars variable in menu3 instance

	}

}
