package oop.this_super;

/*
 * 부모 클래스,상위 클래스(parent,super class)
 * 
 * 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부른다.
 * 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
 * 멤버변수(필드)와 메서드가 상속된다. 단! 생성자는 상속되지 않는다.
 * 
 * 
 */

public class Player {
	
	String name;
	int level;
	int atk;
	int hp;
	
	/* this 
	 * 
	 * this란 자기 자신 객체를 가리키는 키워드 이다.
	 * 생성자 또는 메서드 내에서 this를 사용하면 this는
	 * 그 생성자 또는 메서드를 호출한 객체의 주소값을 띄게 된다.
	 * this()를 사용해서 같은 클래스 내의 다른 생성자를 호출할 수도 있다.
	 * 이 때는 매개변수의 선언에 따라 괄호 내에 적절한 값을 전달하면 된다.
	 * 
	 */
	
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " +this);
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	Player(String name){
		this(); //같은 클래스의 다른 생성자를 부르는 문법.
		System.out.println("Player의 2번 생성자 호출!");
		
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name;
		
	}
	
	
	
	Player(String name,int hp){
		this(name); //다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 한다.
		System.out.println("Player의 3번 생성자 호출!");
		
		this.hp = hp;
	}
	
	void attack(Player target) {
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		System.out.println(this.name +"가"+ target.name + "을 공격합니다.");
//		System.out.println("this: " + this);
		
		target.hp -= 5;
		this.hp += + 5;
		
		System.out.println("나의 체력: " + this.hp + " 상대방 체력: " + target.hp);
	}
	
	void charactorinfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: "+ name);
		System.out.println("# 레벨: "+ level);
		System.out.println("# 공격력: "+ atk);
		System.out.println("# 체력: "+ hp);
//		System.out.println("지금 이 메서드를 호출한 객체의 이름: " + this.name);
		
	}
	
	
	
}
