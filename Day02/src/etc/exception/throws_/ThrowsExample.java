package etc.exception.throws_;

public class ThrowsExample {

	static String[] greetings = {"안녕","헬로","니하오"};
	
	static void greet(int idx) throws Exception {
		//throws는 경고성으로 사용하는 목적도 있다. 빨간줄로 나타나면서
		//예외 가능성을 인식할 수 있다.
		//많은 오류 가능성이 있을 떄 throws를 전부 적용해서 main에서 try,catch로 잡기 위해서 사용
		//생성자에다가 붙일 수 있음
		//시작과 끝이 main함수라서 오류가 발생한 곳 마다 try,catch를 사용하지
		//않고 main,즉 한곳에 몰아넣어서 사용.
		System.out.println(greetings[idx]);
		/* throws
		 * 
		 * throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
		 * 예외 처리를 메서드의 호출부로 떠넘기는 방식.
		 * 
		 * throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출 시
		 * 예외 처리를 강요하고 싶을 때 사용한다.
		 * 
		 * 또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능하다.
		 */
	}
	
	public static void main(String[] args) {
		//메인 메서드에서는 throw를 쓰면 자동 종료. 절대 사용 금지
		
		try {
			
		greet(3);
		
		}catch(Exception e) {
			//printStackTrace() 메서드는 예외 발생 원인을 역추적하여
			//예외가 어디에서 발생헀는지, 그 이유는 무엇인지를
			//메세지를 통해 개발자에게 전달하므로 자주 사용하는 메서드이다.
			
			e.printStackTrace();
			//개발 과정에서 역추적해줌. 에러가 발생한 위치 , 정보를 확인 가능하다.
		}
		System.out.println("프로그램 정상 종료!");
		
	}

}
