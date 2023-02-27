package basic.switch_;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
		int point = sc.nextInt();
		
		
		
		switch(point / 10) {
		case 10:
			if(point>100) {
				System.out.println("잘못된 점수입니다.");
				break;
			}
			System.out.println("A등급");break;
		case 9: System.out.println("B등급");break;
		case 8: System.out.println("C등급");break;
		case 7: System.out.println("D등급");break;
		case 6: System.out.println("E등급");break;
		case 5: System.out.println("F등급");break;
		case 4: System.out.println("G등급");break;
		case 3: System.out.println("H등급");break;
		case 2: System.out.println("I등급");break;
		case 1: System.out.println("J등급");break;
		default: 
			if(point > 100 || point <0) {
				System.out.println("점수를 잘못 입력하셨습니다.");break;
			}
				System.out.println("x등급");break;
			}
			
		
		}
		
	}


