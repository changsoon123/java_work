package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 전사의 고유 기능인 rush 메서드를 작성합니다.
		 * rush의 대상은 모든 직업들 입니다.
		 * 만약 rush의 대상이 전사라면 10의 피해를 받고
		 * 마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다
		 * 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요
		 * 남은 체력도 출력해 주세요
		 * 
		 * main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
		 */
//		Player pp = new Player();
		Warrior ww = new Warrior();
//		Player pp23 = new Warrior();
		Mage pp24 = new Mage();
		
		ww.rush(pp24);
		
		

	}

}


class Player {
	
	String name;
	int level;
	int atk;
	int hp;
	
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	Player(String name){
		this(); 
		System.out.println("Player의 2번 생성자 호출!");
		

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


class Mage extends Player {

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





class Warrior extends Player {

	int rage;
	
	Warrior(){};
	
	Warrior(String name) {
		super(name);
		
		this.rage = 60;
	
		
	}
	
	
	
	Player p0 = new Player();
	
//	Player p1 = new Warrior();
	Player p2 = new Mage();
	
	
//	Warrior pp1 = (Warrior) p1;
	
	
	
	public void rush(Player ob) {
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다!\n",this.name,p0.name);
		
		if(ob instanceof Mage) {
			ob.hp -= 20;
			System.out.printf("%s(마법사)님이 10의 피해를 입었습니다.\n",p0.name);
		} else if(ob instanceof Warrior) {
			ob.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n",p0.name);
			
		} else{
			System.out.println("잘못된 공격입니다.");
		}
		
		
	}
	
	
	@Override   
	void charactorinfo() {
		super.charactorinfo();
		System.out.println("# 분노: " + rage);
	}
	
	
	
	
	
}

