package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		
		//입력받은 수의 약수의 총합을 구하세요.
		//입력받은 값: 12 -> 1 2 3 4 6 12 -> 28
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 받을 값을 입력해주세요");
		int num1 = sc.nextInt();
		int num2 = 1;
		int num3 = 0;
		
		
		
		
		while(num2<=num1) {
			
			if(num1%num2==0) {
				num3 += num2;
				
			}
			
			num2++;
		}
		sc.close();
		System.out.printf("약수들의 총합은 %d 입니다.",num3);
	}

}
