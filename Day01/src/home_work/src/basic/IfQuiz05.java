package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 * 국어,영어,수학 점수를 각각 입력받아서
		 * 평균을 구해 보세요.(평균은 소수점 첫째 자리까지 출력)
		 * 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 * 95~100 -> A+
		 * 94~90 -> A0
		 * 80점대는 B, 70점대는 C, 60점대는 D, 나머지는
		 * 모두 F 처리하시면 됩니다. (100점이 만점)
		 * 
		 * ex)
		 * 평균 점수: 95.5
		 * 당신의 학점은 A+ 입니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int num3 = sc.nextInt();
		
		double sum = 0;
		sum = (double)(num1 + num2 + num3)/3;

		String h;
		
		if(sum > 95) {
			h= "A+";
		} else if(sum >= 90) {
			h= "A0";;
		} else if(sum >= 80) {
			h= "B";;
		} else if(sum >= 70) {
			h= "C";;
		} else if(sum >= 60) {
			h= "D";;
		} else {
			h= "F";;
		}
		
		System.out.printf("평균점수는 %.1f입니다.\n",sum);
		System.out.printf("---------------------\n");
		System.out.printf("당신의 학점은 %s학점 입니다.\n",h);
		sc.close();
		
	}

}
