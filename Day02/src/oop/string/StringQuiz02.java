package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1.주민등록번호 13자리를 입력받습니다.
		 * 2.주민등록번호는 -을 포함해서 받을 예정입니다.
		 * 3.13자리가 아니라면 다시 입력 받습니다.
		 * 4.남자인지 여자인지를 구분해서 출력해 주세요.
		 */
		
		String a;
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("주민등록번호를 입력하세요: ");
		System.out.println("-을 포함해서 입력해주세요: ");
		String soo = sc.nextLine();
		
		a = soo.trim();
		
		a = soo.replace(" ", "");
		
		char b = a.charAt(7);
		
		System.out.println();
		
		if(a.length()==14) {
			if(b=='1' || b=='3') {
				System.out.println("남자 입니다.");
				break;
				
			} else if(b=='2' || b =='4') {
				System.out.println("여자 입니다.");
				
				break;
			} else {
				System.out.println("사람이 아닙니다.");
				break;
			}
			} else {
				System.out.printf("다시 입력해주세요.");
				continue;
			}
		 
		}
		
		sc.close();
		
		
	}

}
