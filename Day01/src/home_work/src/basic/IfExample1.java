package basic;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수 " + point + "점");
		System.out.println("--------------------");
		
		if(point >= 70) {
			System.out.println("congratulation!!");
		} else if(point < 70 && point >=60 ){
			System.out.println("힘내세요");
		} else if(point< 60 && point >= 50) {
			System.out.println("ㅠㅠㅠㅠㅠㅠㅠ");
		} else {
			System.out.println("답이 없습니다.");
			
		}
		
		System.out.println("고생은 하셨네요");
		
		sc.close();
		
	}

}
