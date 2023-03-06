package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.charactorinfo();
		System.out.println("=====================");
		
		Player m1 = new Mage();
		
		m1.level = 1;
		m1.atk = 3;
		m1.hp = 50;
		m1.name = "법사1";
		
		m1.charactorinfo();
		
	}

}
