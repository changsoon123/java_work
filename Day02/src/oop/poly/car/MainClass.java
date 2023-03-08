package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		Sonata[] so = {s1,s2,s3};
//		for(Sonata s:so) {
//			s.run();
//		}
//		Tesla[] te = {t1,t2,t3,t4};
//		for(Tesla s:te) {
//			s.run();
//		}
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.
//		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
//		for(Car c:cars) {
//			c.run();
//		}
//		
//		System.out.println("---------------------");
//		
//		System.out.println("*** 타이어 교체 작업! ***");
//		t1.frontLeft = new Tire();
//		t1.frontRight = new Tire();
//		t1.rearLeft = new Tire();
//		t1.rearRight = new Tire();
//		
		new Sonata2();
//		Car sisi2 = new Sonata2();
		Car soso = new Sonata();
		
		System.out.println(new Sonata());
		System.out.println(soso);
		Sonata sisi = (Sonata) soso;
		System.out.println(sisi);
//		Sonata2 sisi3 = (Sonata2) sisi;
//		System.out.println(sisi3);
	
		
		
		
		System.out.println("-------------------------");
		
		Driver kim = new Driver();
		kim.drive(s1);
		kim.drive(p1);
		kim.drive(t1);
		
		Car c = kim.buyCar("테슬라");
		Tesla t = (Tesla) c;
		
		/*  객체에 대한 구분이 필요함.
		 *  println에서 나오는 kim.buyCar("테슬라")가 값이
		 * 
		 */
		System.out.println(kim.buyCar("테슬라"));
		System.out.println(c);
		System.out.println(t);
		
		c.run();
		t.enterMembership();
		
		CarShop shop = new CarShop();
		shop.carPrice(s3);
		shop.carPrice(new Tesla());
		shop.carPrice(kim.buyCar("포르쉐"));
		
		
		
	}

}
