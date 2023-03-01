package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRulette {

	public static void main(String[] args) {
			
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		
		Scanner sc = new Scanner(System.in);
		//게임 인원 입력
		
		//플레이어 이름 등록하고
		//배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 게임 참가자의 명수와 동일합니다.
		//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
		//실탄을 탄창에 배치합니다.
		
		boolean[] bulletPos = new boolean[6];
		
		//난수를 생성하셔서 실탄을 탄창에 배치합니다.
		//false -> true로 바꾸는 것이 실탄 장전입니다.
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		//실행 순서 정하기
		//난수를 이용해서 실행 순서를 정한다.
		//시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		//아예 배치를 섞으셔도 상관 없습니다.
		
		//일부러 입력 대기를 해서 흐름을 잠시 끊어준다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에 따로 변수를 선언 하지 않습니다.
		//따로 변수를 선언하지 않는다.
		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.
		
		
		int count1 = 0;
		int uo = (int)(Math.random()*5)+1;
		
		
		
		sop:while(true) {
			int count = 0;
			String[] bo1 = new String[4];
			System.out.println("참가 인원의 이름을 입력해주세요. ");
			System.out.println("최소인원 2명, 최대인원4명. ");
			
			sal:for(int i=0;i<=bo1.length;i++) {
				if(count>1) {
				System.out.println("추가 인원을 입력해주세요.");
				}
				String ss = sc.next();
				sc.nextLine();
				
				bo1[i]=ss;
				count++;
				System.out.printf("%d명\n",count);
				if(count>1 && count<4) {
					System.out.println("인원 수가 완료 되셨습니까?");
					System.out.println("완료 되었으면 엔터키를 눌러주세요.추가하실려면 아무키나 누르고 엔터키를 누르세요.");
					
					String ss1 = sc.nextLine();
//					System.out.println("ss1 동등 비교 결과: " + (ss1.equals("")));
					
					if(ss1.equals("")) {
						break;
					} else {
					
						
						continue sal;
					}
				}
				if(count>3) {
					System.out.println("최대 인원입니다.");
					break;
				}
			}
		for(int j=0;j<=3;j++) {
			if(bo1[j]==null) break;
			System.out.println(bo1[j]);
		}
		System.out.println("게임을 시작합니다!");
		
		
		rere:for(int i=0;i<6;i++) {
			int uo1 = (int)(Math.random()*2)+1;
			if(uo1==1) {
				bulletPos[i]=true;
			} else if(uo1==2) {
				bulletPos[i]=false;
			} 
			
				if(bulletPos[i]==true) {
					count1++;
				} 
			if(count1>4) {
				break;
			}
			if(count1<1) {
				continue rere;
			}
			
		}
		
		String[] tmp = new String[2];
		String[] tmp1 = new String[3];
		
		 if(bo1[2]==null) {
			 
		 for(int j=0;j<2;j++) {
			 
			 tmp[j] = bo1[j];
			 }
		 bo1 = tmp;
		 tmp = null;
		 }
		 if(bo1[3]==null) {
			 
		 for(int j=0;j<3;j++) {
			 
			 tmp1[j] = bo1[j];
			 }
		 bo1 = tmp1;
		 tmp1 = null;
		 }
		
		
		
		while(true) {
		
			for(int i=0;i<bo1.length;i++) {
				if(bo1[i]==null)break;
			System.out.printf("%s 선수 준비해주세요~",bo1[i]);
			System.out.println("준비가 완료되면 엔터를 눌러주세요!");
			String ss1 = sc.nextLine();
			 if(bulletPos[i]==true) {
				 System.out.println("빵야!");
				 System.out.printf("%s가 제거 되었습니다.",bo1[i]);
				 bo1[i]=bo1[i+1];
			 }
//			 if(bo1[2]==null) {
//				 String[] tmp = new String[1];
//				 
//			 for(int j=0;j<1;j++) {
//				 
//				 tmp[j] = bo1[j];
//				 }
//			 bo1 = tmp;
//			 tmp = null;
//			 }
//			 if(bo1[3]==null) {
//				 String[] tmp1 = new String[2];
//				 
//			 for(int j=0;j<2;j++) {
//				 
//				 tmp1[j] = bo1[j];
//				 }
//			 bo1 = tmp1;
//			 tmp1 = null;
//			 }
//			 if(bo1[i+3]==null) {
//				 String[] tmp2 = new String[i+2];
//				 
//			 for(int j=0;j<bo1.length;j++) {
//				 
//				 tmp2[j] = bo1[j];
//				 bo1 = tmp2;
//				 tmp2 = null;
//				 }
//			 }
			 if(!(bo1[0]==null) && bo1[1]==null) {
				 System.out.println("----------------");
				 System.out.print("생존인원: ");
				 System.out.println(Arrays.toString(bo1));
				 System.out.printf("%s승리했습니다!!!!!.",bo1[0]);
			 }
			 
			 
			 System.out.println("----------------");
			 System.out.print("생존인원: ");
			 System.out.println(Arrays.toString(bo1));
			}
			
		}
		
			
				
		}
		
	}

}
