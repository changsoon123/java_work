package basic;

public class CastingExample1 {

	public static void main(String[] args) {
		/*
		 * 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		 * 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		 * (promotion, UpCasting)
		 * 
		 */
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		char d = 'A';
		int j = d;
		System.out.println("A의 문자 번호: "+j);
		
		int k = 500;
		double o = k;
		System.out.println(o);
		
		//down casting
		
		int i2 = 12;
		byte c = (byte) i2;
		System.out.println(c);
		
		
		
	}

}