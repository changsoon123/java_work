package basic.operator;

import java.util.Arrays;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 * 대입 연산자 (=)
		 * 복합 대입 연산자 (+=,-=,*=, /= , %=)
		 * 변수에 값을 대입할 때 사용하는 연산자 입니다.
		 * 복합 대입 연산자는 대입 연산자에 산술 연산자
		 */
		
		int a = 5;
		int b = 5;
		
		
		a += 3; //a = a + 3;
		System.out.println(a);
		System.out.println("------------------");
		
		a -= 3; //a = a + 3;
		System.out.println(a);
		
		a *= 3; //a = a + 3;
		System.out.println(a);
		
		a /= 3; //a = a + 3;
		System.out.println(a);
		
		a %= 3; //a = a + 3;
		System.out.println(a);
		
		
	}

}
