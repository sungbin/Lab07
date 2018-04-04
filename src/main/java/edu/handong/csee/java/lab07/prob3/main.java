package edu.handong.csee.java.lab07.prob3;

import java.util.Random;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGen = new Random();
		Attendance st1 = new Attendance("Jess",4,21400999,0);
		Attendance st2 = new Attendance("Kent",2,21700111,0);
		Attendance st3 = new Attendance("Lucas",1,21833222,0);
		Attendance st4 = new Attendance("Martha",2,21733444,0);
		
		st1.missed = randomGen.nextInt(10);
		st2.missed = randomGen.nextInt(10);
		st3.missed = randomGen.nextInt(10);
		st4.missed = randomGen.nextInt(10);
		
		st1.Print_result();
		st2.Print_result();
		st3.Print_result();
		st4.Print_result();

	}

}
