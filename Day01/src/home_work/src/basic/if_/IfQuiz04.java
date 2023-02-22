package basic.if_;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 입력 받습니다.
		 * 가장 큰 값, 가장 작은 값, 중간 값을 구해서 출력해 보세요.
		 * 
		 * max,mid,min이라는 변수를 미리 선언하셔서
		 * 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		 * 마지막에 한번에 출력하시면 되겠습니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("정수1를 입력해주세요");
		int input1 = sc.nextInt();
		
		
		System.out.println("정수2를 입력해주세요(정수1과 똑같은 숫자를 넣지 마세요)");
		int input2 = sc.nextInt();
	
		
		System.out.println("정수3를 입력해주세요(정수1,정수2와 똑같은 숫자를 넣지 마세요)");
		int input3 = sc.nextInt();
		
		System.out.print("-------------------\n");
		if(input1 > input2 && input1 > input3 && input1!=input2 && input2 != input3) {
			if(input2 > input3) {
				System.out.printf("max:%d,mid:%d,min:%d",input1,input2,input3);
			}else if(input2 < input3) {
				System.out.printf("max:%d,mid:%d,min:%d",input1,input3,input2);
			}
		} else if(input2 > input1 && input2 > input3 && input1!=input2 && input2 != input3) {
			if(input1 > input3) {
				System.out.printf("max:%d,mid:%d,min:%d",input2,input1,input3);
			}else if(input1 < input3) {
				System.out.printf("max:%d,mid:%d,min:%d",input2,input3,input1);
			}
		} else if(input3 > input1 && input3 > input2 && input1!=input2 && input2 != input3) {
			if(input1 > input2) {
				System.out.printf("max:%d,mid:%d,min:%d",input3,input1,input2);
			}else if(input1 < input2) {
				System.out.printf("max:%d,mid:%d,min:%d",input3,input2,input1);
			}
		}
		
		sc.close();
		
		
	}

}
