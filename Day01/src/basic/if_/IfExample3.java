package basic.if_;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		
		/*
		 * if의 중첩문
		 * else if문이 첫번째 조건식이 false일 경우 분기를 나눴다면
		 * if의 중첩문은 첫번째 조건식이 true인 경우 분기를 나누는 방식입니다.
		 * 변수의 사용 범위 (유효 범위)
		 * 변수는 선언된 블록 내에서만 유효합니다.
		 * 선언된 블록을 벗어나면 메모리에서 자동으로 소멸합니다.
		 * 변수를 선언할 때 사용 범위를 잘 파악해서
		 * 전체적으로 사용할 변수라면 미리 선언해 두고,
		 * 지엽적으로 사용할 변수는 그 블록 범위 내에서만 사용하고
		 * 소멸시키는 것이 좋습니다.
		 * 
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요. ");
		int input1 = sc.nextInt();
		
		if(input1 > 140) {
			System.out.println("나이를 입력하세요. ");
			int input2 = sc.nextInt();
			if(input2 >= 8) {
			System.out.println("입장하세요");
			} else if(input2 >= 6) {
				System.out.println("봐줄께");
			}
		} else {
			System.out.println("빠빠빠빠빠빠빠이이~~~~");
		}
		
		sc.close();
	}

}
