package oop.static_method;

public class Count {

	public int a; //인스턴스 변수
	public static int b; //정적 변수 (클래스 변수)
	
	/* 
	 * #인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
	 * 인스턴스 메서드 안에서는 정적(static) 변수와 인스턴스 변수 모두를 참조할 수 있다.
	 */
	
	public int method1() {
		return a + Count.b;	
	}
	
	/* static 블록(메서드,정적 초기화자) 내부에서는
	 * static이 붙은 변수나 메서드만 사용할 수 있다.
	 * 
	 * static 블록 내부에서 non-static멤버를 사용하려면
	 * 반드시 객체를 생성해서 주소값을 통해 참조해야 한다.
	 * static 메서드는 모든 객체가 공유해도 괜찮을 때 사용
	 * 
	 */
	
	
	public static int method2() { //객체 생성으로 클래스 변수에 접근할 수 없다.
		
		Count ccc = new Count(); //인스턴스 변수에 접근하기 위한 방법.
		return ccc.a + Count.b; //this를 못씀 메모리에 올라간 상태(나타낼 주소값이 없음)
		
	}
	
	
}
