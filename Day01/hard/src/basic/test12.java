package basic;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		

		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

         추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.

        */
		
		String[] foods=new String[50];
		Scanner sc = new Scanner(System.in);
		
		
		sop:for(int i=0;i<foods.length;i++) {
			System.out.println("음식 이름을 입력해 주세요.");
			String name = sc.next();
			
			
			
			for(int j=0;j<i;j++) {
				if(name.equals(foods[j])) {
					System.out.println("이미 존재하는 음식입니다.");
					System.out.println("다시 입력해주세요.");
					i--;
					continue sop;
					
					}
				
				}
			if(name.equals("배불러")) {
				break;
			}
			foods[i] = name;
			
			
			
		}
		
		
		int tmp = 0;
		
		for(String sol:foods) {
			if(sol == null) {
				break;
				}
			
			System.out.println(sol+" ");
		}
		
		sc.close();
		
		
		
		
	}

}
