package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class chap5 {

	public static void main(String[] args) {

		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");
		
		while(true) {
			
			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			System.out.println("--------------------------------");
			
			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				try {
				System.out.println("메뉴명을 입력해주세요");
				String menu1 = sc.next();
				System.out.println("가격을 입력해주세요");
				int menu2 = sc.nextInt();
				
				if(foods.containsKey(menu1)) {
					System.out.println("이미 존재하는 메뉴입니다.");
				} else {
					foods.put(menu1,menu2);
					System.out.println(menu1+" 메뉴가 등록되었습니다");
				}
				
				} catch(Exception e) {
					System.out.println("똑바로 입력하세요.");
					continue;
				}
				
				
				
				
			} else if(menu == 2) {
				
				if(foods.size()==0) {
					System.out.println("메뉴부터 먼저 등록해 주세요!");
					continue;
				}
				
				Set<String> keys =  foods.keySet();
				
				for(String k:keys) {
					System.out.println(k + " : " + foods.get(k));
				}
				
				System.out.println("1. 수정 | 2. 삭제 | 3. 취소");
				System.out.println("숫자를 입력해주세요.");
				int ssi = sc.nextInt();
				
				
				if(ssi==1) {
				System.out.println("수정할 메뉴를 알려주세요.");
				String ssc = sc.next();
				
				if(foods.containsKey(ssc)) {
					System.out.println("변경할 가격을 알려주세요.");
					int sso = sc.nextInt();
					foods.put(ssc,sso);
					
					System.out.println(ssc+" 메뉴가 변경 되었습니다.");
					} else {
						System.out.println("없는 메뉴입니다.");
					}
				
				} else if(ssi==2) {
					System.out.println("삭제할 메뉴를 알려주세요.");
					String ssc1 = sc.next();
					if(foods.containsKey(ssc1)) {
					foods.remove(ssc1);
					System.out.println(ssc1+" 메뉴가 삭제 되었습니다.");
					} else {
						System.out.println("없는 메뉴입니다.");
					}
				} else if(ssi==3) {
					continue;
				} else {
					System.out.println("똑바로 입력하세요.");
				}
				
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 
				 
				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....
				  
				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 취소: 메인 메뉴로 이동
				 */
				
					
			} else if(menu == 3) {
				System.out.println("정말 종료하시겠습니까?");
				
				String nn=sc.next();
				
				if(nn.equals("y") || nn.equals("Y")) {
					break;
				} else {
					continue;
				}
				 /*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			
			
			
		}
		
		sc.close();
	}

}
