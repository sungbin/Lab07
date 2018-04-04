package edu.handong.csee.java.lab07.prob2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken menu1 = new Chicken("Cheese_mustard",17000.00,5);
		Chicken menu2 = new Chicken("Honey_mustard",17000.00,5);
		Chicken menu3 = new Chicken("Spicey_chicken",17000.00,5);
		
		menu1.Set_stars(3);
		menu2.Set_stars(4);
		menu3.Set_stars(1);
		
		System.out.println(menu1.name + "'s rating is " + menu1.stars);
		System.out.println(menu2.name + "'s rating is " + menu2.stars);
		System.out.println(menu3.name + "'s rating is " + menu3.stars);

	}

}
