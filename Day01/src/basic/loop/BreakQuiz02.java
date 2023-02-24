package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {
		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        */
		Scanner sc = new Scanner(System.in);
	
		
		int so = (int)((Math.random()*100)+1);
		int pi = 0;
		int pi2 = 10;
	
		
		while(true) {
			System.out.println("정답을 맞추세요");
			int po = sc.nextInt();
			if(so>po) {
				System.out.println("UP!!!\n");
				pi++;
				pi2--;
				if(pi2>0) {
				System.out.printf("%d 기회가 남았습니다\n",pi2);
				}
				if(pi2==0) {
					System.out.printf("정답 기회 소진!\n");
					System.out.printf("계속 정답을 맞춰주세요~\n");
				}
				
			} else if(so<po) {
				System.out.println("DOWN!!!\n");
				pi++;
				pi2--;
				if(pi2>0) {
					System.out.printf("%d 기회가 남았습니다\n",pi2);
				}
				if(pi2==0) {
					System.out.printf("정답 기회 소진!\n");
					System.out.printf("계속 정답을 맞춰주세요~\n");
				}
			} else {
				System.out.println("정답입니다!!!\n");
				if(pi2>=0) {
					System.out.printf("승리했습니다.\n");
				} else {
					System.out.printf("패배했습니다.\n");
				}
				System.out.printf("%d번만에 맞추셨네요~",pi);
				break;
			}
			
		}
		sc.close();
	}

}
