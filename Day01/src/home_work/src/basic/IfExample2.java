package basic;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요. ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인 입니다.");
		} else if(age >= 17) {
			System.out.println("고등학생 입니다.");
		} else if(age >= 14) {
			System.out.println("중학생 입니다.");			
		} else if(age >= 8) {
			System.out.println("초등학생 입니다.");						
		} else {
			System.out.println("애기 입니다.");									
		}
		
		sc.close();
	}

}