package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.name = "전사1";
		System.out.println("p1의 주소값: " + p1);
		p1.charactorinfo();
		
		Player p2 = new Player("전전사"); //선언부로 바로 이동 F3
		System.out.println("p2의 주소값: " + p2);
		p2.charactorinfo();
		
		Player p3 = new Player("쩐사",100); //선언부로 바로 이동 F3
		System.out.println("p2의 주소값: " + p3);
		p3.charactorinfo();
		
		System.out.println("---------------------------");
		
		p3.attack(p2);
		System.out.println("-----------------------");
		
		Warrior w1 = new Warrior("바보")	;
		w1.charactorinfo();
		System.out.println("-----------------------");
		
		Mage m1 = new Mage();
		m1.charactorinfo();
		
		w1.attack(m1);
		
	}

}
