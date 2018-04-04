package edu.handong.csee.java.lab07.prob3; //The file is in this package

import java.util.Random; //include random's functions
/**
 * the main make and set 4 instance of Attendance
 * put random value into miss class variable of each instance.
 * so need Random's function.
 * and print if student is failed or not
 * need Attendance class.
 */
public class main { //declare main class
	public static void main(String[] args) { //declare main method
		// TODO Auto-generated method stub
		Random randomGen = new Random(); //make instance of Random
		Attendance st1 = new Attendance("Jess",4,21400999,0); //make and set instance of Attendance
		Attendance st2 = new Attendance("Kent",2,21700111,0); //make and set instance of Attendance
		Attendance st3 = new Attendance("Lucas",1,21833222,0); //make and set instance of Attendance
		Attendance st4 = new Attendance("Martha",2,21733444,0); //make and set instance of Attendance
		
		st1.missed = randomGen.nextInt(10); //input random number(0~10) to missed variable
		st2.missed = randomGen.nextInt(10); //input random number(0~10) to missed variable
		st3.missed = randomGen.nextInt(10); //input random number(0~10) to missed variable
		st4.missed = randomGen.nextInt(10); //input random number(0~10) to missed variable
		
		st1.Print_result(); //print result of st1
		st2.Print_result(); //print result of st2
		st3.Print_result(); //print result of st3
		st4.Print_result(); //print result of st4
	}
}
