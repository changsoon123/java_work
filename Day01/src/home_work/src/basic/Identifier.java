package basic;

public class Identifier {

	public static void main(String[] args) {
		/*
		꼭 지켜야 할 규칙(안 지킬 시 에러가 발생할 수 있습니다.)
		1. 식별자의 이름은 중복을 허용하지 않습니다.
		그리고, 대/소문자를 철저하게 구분합니다.
		*/
		
		int age = 35;
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하시면 안됩니다.
		// int 800 = 365;
		// int 7num = 7;
		int number7 = 7;
		
		//3. 식별자 이름에 공백을 포함할 수 없습니다.
		// int my birth day = 1993
		int myBirthDay = 1993; //camel case문법 낙타 문법
		
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_),달러기호($)
		//저 특수문자들은 사용하기로 약속한 곳이 지정되어 있습니다.(상수)
		
		int $fofo = 10;
		String $hello = "안녕";
		//int #fufu = 10;
		//int &fufu = 10;
		
		final int $GUGU = 11;
		final int $GU_GU = 12;
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자입니다.
		
		//String class = "클래스";
		String Class = "클래스"; //권장하지 않습니다.
		String className = "클래스";
		
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
		//하지만 사용을 권장하지는 않습니다.
		int 숫자 = 10;
		String 名 = "홍길동";
		System.out.println(名);
		System.out.println(숫자);
		
		
		
		
				
		

		
		
		
	}

}
