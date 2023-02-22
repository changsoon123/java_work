package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {
		
		/*
		 * 42 ~ 396사이의 난수를 발생시킨 후
		 * 발생한 난수가 홀수인지 짝수인지의 여부를
		 * 3항 연산식으로 출력해 보세요.
		 * 
		 * 발생한 난수: xx
		 * 3항 연산의 결과: 홀수입니다 or 짝수입니다.
		 */
		
		//곱할 때 1을 추가해야 범위를 맞출수 있다.random값이 0.0~0.9이기 때문
		
		int rn1 = (int)(Math.random()*355)+42; 
		
		String result = (rn1%2==0 ? "짝수 입니다" : "홀수입니다");
		
		System.out.println("발생한 난수: "+rn1);
		
		System.out.println("3항 연산의 결과: "+result);
		
		
	}

}
