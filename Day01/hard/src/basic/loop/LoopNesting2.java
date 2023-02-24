package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int nu = sc.nextInt();
		
		System.out.printf("입력받은 수-> %d \n",nu);
		System.out.printf("소수는: ");
		
		int sum = 0, x = 0;
		
		for(int i=1;i<=nu;i++) {
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					x++;
				}
				
			}
			
			if (x==2) {
				System.out.print(" "+i);
				sum++;
			}
			x=0;
		}
		System.out.println();
		System.out.printf("소수의 개수는: %d",sum);
		sc.close();
	}
}
