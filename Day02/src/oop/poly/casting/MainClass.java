package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Child();
		//다형성 적용(promotion)
		p.n1 = 1;
		p.method1();
	
		Child pp = (Child) p; // 부모 타입을 자식 타입으로 강제 변환(Downcasting)
		pp.n2 = 2;
		
		pp.method3();
		
		
		/* 다형성이 적용되면 자식 클래스의 본래의 멤버(필드, 메서드)를 참조하지
		 * 못하는 문제가 발생한다.
		 * 
		 * 이를 해결하기 위해 강제 타입 변환을 사용한다.
		 */
		
		System.out.println("p의 주소값: " + p);
		System.out.println("pp의 주소값: " + pp);
		
		//다형성이 한 번도 발생하지 않은 경우에는
		//강제 형 변환을 사용할 수 없습니다.
		Parent ppp = new Parent();
//		Child c3 = (Child) ppp;
		
	}

}
