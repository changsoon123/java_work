package oop.inherit.good;

public class Mage extends Player {

	int mana;
	
	@Override
	void charactorinfo() {
		super.charactorinfo();
		System.out.println("# 정신력: " + mana);
	}
	
	
	
	
}
