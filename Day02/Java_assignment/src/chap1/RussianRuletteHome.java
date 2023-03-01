package chap1;


import java.util.Arrays;
import java.util.Scanner;


public class RussianRuletteHome {

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
		
		System.out.println("게임 인원을 정해주세요.(2명~4명)");
		int num = sc.nextInt();
		if(num <2 || num >4) {
			while(true) {
				System.out.println("게임 인원을 다시 정해주세요.(2명~4명)");
				num = sc.nextInt();
				if(num >1 && num <5) {
					break;
				}
			}
		}
		
		String[] people = new String[num];
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d번째 선수의 이름을 입력하세요: ",i+1);
			people[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(people));
		System.out.println("----------------------");
		System.out.println("총알 개수를 정해주세요. (1발~5발)");
		int bnum = sc.nextInt();
		
		if(bnum<1 || bnum >5) {
			
		while(true) {
		System.out.println("총알 개수를 다시 정해주세요. (1발~5발)");
		bnum = sc.nextInt();
		if(bnum >0 && bnum < 6) {
			break;
		}
			}
		}
	
		//총알 6개중 랜덤 true 값을 만들어서 조건 충족
		
		boolean[] bulletPos = new boolean[6];
		
		int bullet = 0;
		
		while(bullet<bnum) {
			int rannum = (int)(Math.random()*bulletPos.length);
			if(bulletPos[rannum]) {
				continue;
			} else {
				bulletPos[rannum] = true;
				bullet++;
				
			}
			
		}
//		System.out.println(Arrays.toString(bulletPos));
//		System.out.println(Arrays.toString(people));
// 		사람들 배치를 섞기
		
		int count12 = 0;
		
		while(true) {
			int rannum1 = (int)(Math.random()*people.length);
			int rannum2 = (int)(Math.random()*people.length);
			String[] tmp = new String[people.length]; 
			if(people[rannum1]!=people[rannum2]) {
				tmp[rannum1] = people[rannum1];
				people[rannum1] = people[rannum2];
				people[rannum2] = tmp[rannum1];
				tmp=null;
				count12++;
				if(count12==10) {
				break;
				}
			} else {
				continue;
			}
		
		}
		System.out.println("===========================================");
		System.out.println("총을 쏠 순서를 바꿨습니다"+Arrays.toString(people));
		System.out.println("===========================================");
//		System.out.println(Arrays.toString(people));
		
		
//      사람들 배치 랜덤 섞기.		
//		System.out.println(Arrays.toString(bulletPos));
//		System.out.println(bullet);
		
		int shotnum = 0;
		int peoplenum = 0;
		sc.nextLine();
		
		
		while(true) {
			System.out.println("준비하시고~~~~~~~~");
			System.out.println("준비가 완료 되시면 엔터를 눌러주세요!");
			System.out.println("----------------------------");
			sc.nextLine();
			if(bulletPos[shotnum]) {
				System.out.printf("빵야!!!! ");
				System.out.printf("%s님이 사망하셨습니다.\n ", people[peoplenum]);
				
				for(int i=peoplenum;i<people.length-1;i++) {
					people[i]=people[i+1];
				}
				String[] tmp1= new String[people.length-1];
				
				for(int i=0;i<tmp1.length;i++) {
					tmp1[i]=people[i];
				}
				people = tmp1; tmp1=null;
				
				bulletPos[shotnum]=false;
				bullet--;
				num--;
				shotnum++;
			
				//shotnum++을 하면 오류가 남. 이유는 people 사람 수는 tmp1때문에 줄어드는데
				//shotnum을 늘리면 배열 범위 초과
				//shotnum과 peoplenum을 따로 써야 문제 해결;;
				
				if(people.length==peoplenum) {
					System.out.println("최후인원: "+Arrays.toString(people));
					System.out.println("당신들은 살았습니다. 도망치세요.");
					break;
				}
				
				
				if(people.length==1) {
					System.out.println("최후인원: "+Arrays.toString(people));
					System.out.println("승리하셨습니다!!!. ");
					break;
						
				} else if(bullet==0) {
					System.out.println("최후인원: "+Arrays.toString(people));
					System.out.println("당신들은 살았습니다. 도망치세요.");
					break;
				}
				
				System.out.printf("생존인원수: %d\n ", num);
				System.out.println("생존인원: "+Arrays.toString(people));
				System.out.printf("남은총알: %d \n ", bullet);
				
			} else {
				System.out.printf("%s님이 살았습니다.\n ", people[peoplenum]);
				
				
				
				shotnum++;
				
				peoplenum++;
				
				
				//전부다 한번씩 총을 쐇으면 끝.
			
				if(people.length==peoplenum) {
					System.out.println("최후인원: "+Arrays.toString(people));
					System.out.println("당신들은 살았습니다. 도망치세요.");
					break;
				}
				
				
			}
			
		}
		
		
		
		
		
		
	}

}