package oop.this_super;

public class Mage extends Player {

	int mana;
	
	Mage(){
		
		this.name = "멍충이";
		this.mana = 10;
	}
	
	
	
	@Override
	void charactorinfo() {
		super.charactorinfo();
		System.out.println("# 정신력: " + mana);
	}
	
	
	
	
}
