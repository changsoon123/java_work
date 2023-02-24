class Car {
	String color;		// ����
	String gearType;	// ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			// ���� ����

	Car() {
		
		
	} // 매개변수가 없는 기본 생성자를 통해서 클래스를 땡겨올 수 있다.
	
			 //	하지만 매개 변수가 있는 생성자를 통해서 생성자 호출을 할 수 있는데
	         // 매개변수를 통해서 객체 값 초기화를 진행 할 수 있다.
	         // 매개 변수가 없을 시에는 기본 생성자로 취급하며, 매개 변수가 있을시 
	         // 반드시 기본 생성자를 생성해야 한다.
			
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

class Ex6_12 {
	public static void main(String[] args) {
//		Car c1 = new Car();
//		c1.color    = "white";
//		c1.gearType = "auto";
//		c1.door = 4;

		Car c2 = new Car("white", "auto", 4);

//		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}