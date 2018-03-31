package edu.handog.csee.java.lab07.prob01;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input_years;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input year:");
		input_years = keyboard.nextInt();
		System.out.println(input_years + " is " +((input_years/100)+1)+"th century.");

	}

}
