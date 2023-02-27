package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
	/*
	 * 사용자에게 구구단 단수를 입력받아서
	 * 해당 단수의 구구단을 출력해 보세요.
	 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단을 입력하세요");
//		int a = sc.nextInt();
		
		int b = 1;
		int c = 1;
		
		while(c<10) {
			
			while(b<10) {
		
				System.out.printf("%d * %d = %d\n",c,b,c*b);
				b++;
			}
		c++;
		b = 1;
		}
//		sc.close();
	}

}