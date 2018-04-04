package edu.handog.csee.java.lab07.prob01; //the file is in this package

import java.util.Scanner; //include Scanner functions.
public class main { //declare main class public type

	/**
	 * This main function notice what is century
	 * scan one years from user and print century that match the one.
	 */
	public static void main(String[] args) { //this is main function, public static type
		// TODO Auto-generated method stub
		
		int input_years; //declare variable int type
		
		Scanner keyboard = new Scanner(System.in); //make instance namd keyboard
		
		System.out.println("Input year:"); //print sentence
		input_years = keyboard.nextInt(); //call nextInt function, input the result to variable
		System.out.println(input_years + " is " +((input_years/100)+1)+"th century."); //print sentence

	}

}
