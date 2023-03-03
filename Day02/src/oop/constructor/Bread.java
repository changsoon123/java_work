package oop.constructor;

public class Bread {
	
	int price;
	String name;
	String kind;
	
	Bread(){}
	
	Bread(String name01){
		price = 500_000;
		name = name01;
		kind = "밀가루";
		
	}
	
	Bread(String name01 , String bIngredient, int bPrice){
		price = bPrice;
		kind = bIngredient;
		name = name01;
		
	}
	
		void info() {
		System.out.println("빵 이름: " + name);	
		System.out.println("빵 가격: " + price);	
		System.out.println("주 재료: " + kind);	
			
		}
}
