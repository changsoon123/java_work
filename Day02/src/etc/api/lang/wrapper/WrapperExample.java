package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {

		
		int a =100;
		boolean b =false;
		char c = 'A';
		double d = 3.14;
		
		//boxing: 기본 데이터타입을 객체타입으로 변환하는 과정(권장 x)
//		Integer v1 = new Integer(100); //도태된 문법.
		
//		Boolean v2 = new Boolean(b);
		
//		Character v3 = new Character(c);
		
//		Double v4 = new Double(d);
		
		//autoboxing: 기본 타입을 자동으로 객체형으로 변환.
		
		Integer x1 = a;
		Boolean v2 = b;
		Character v3 = c;
		Double v4 = d;
		
//		int i = x1.intvalueof(); 도태된 문법
		
		//autounboxing:객체 포장을 기본형으로 해제 가능.
		
		int i = x1;
		boolean ii = v2;
		char iii = v3;
		double iiii = v4;
		
		//AutoBoxing 이후에 wrapper 클래스는 문자열을 기본형으로
		//변환하는데 많이 사용됨.
		
		//해당 타입으로 변환할 수 없는 문자열을 시도했을 경우
		//NumberFormatException 예외가 발생
		String s2 = "3.14";
		Integer.parseInt(s2); //런타임에러. 적절하지 않은 문자열 format
		
	}

}
