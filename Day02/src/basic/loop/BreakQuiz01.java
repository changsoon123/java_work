package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/* 2가지의 정수를 1~ 100사이의 난수를 발생시켜서
		 * 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 * 사용자가 0을 입력하면 반복문을 탈출시키세요.
		 * 
		 * 2.종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("***연산 퀴즈***");
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int tmp = 0;
		
		while(true) {
			
			int num1 = (int)(Math.random()*101);
			int num2 = (int)(Math.random()*101);
			
			int num3 = (int)(Math.random()*4);
			
			if(num3==0) {
			    String nunu1= Integer.toString(num3);
			} else if(num3==1) {
				String nunu2= Integer.toString(num3);
			} else if(num3==2) {
				String nunu3= Integer.toString(num3);
			} else if(num3==3) {
				String nunu4= Integer.toString(num3);
			}
			
			String nunu1 = "+";
			String nunu2 = "-";
			String nunu3 = "*";
			String nunu4 = "/";
			
			if(num3==0) {
			System.out.printf("%d %s %d =???",num1,nunu1,num2,num1+num2);
			a++;
			} else if(num3==1) {
				System.out.printf("%d %s %d =???",num1,nunu2,num2,num1-num2);
				b++;
			} else if(num3==2) {
				System.out.printf("%d %s %d =???",num1,nunu3,num2,num1*num2);
				c++;
			} else if(num3==3) {
				if(num2>num1) {
				tmp = num2;
				num2 = num1;
				num1 = tmp;
				}
				System.out.printf("%d %s %d =???",num1,nunu4,num2,num1/num2);
				d++;
			}
			System.out.println("정답을 입력 해주세요.종료 하실려면 0");
			int sc1 = sc.nextInt();
			int so1=num1+num2;
			int so2=num1-num2;
			int so3=num1*num2;
			int so4=num1/num2;
			if(a==1 && sc1!=e) {
				if(so1==sc1) {
				System.out.println("\n정답입니다.");
				f++;
				
				}else if(so1!=sc1) {
					System.out.println("\n오답입니다.");
					g++;
				}
			} 
			
			if(b==1 && sc1!=e) {
				if(so2==sc1 ) {
				System.out.println("\n정답입니다.");
				f++;
				}else if(so2!=sc1) {
					System.out.println("\n오답입니다.");
					g++;
				}
			} 
			if(c==1 && sc1!=e) {
				if(so3==sc1) {
				System.out.println("\n정답입니다.");
				f++;
				}else if(so3!=sc1) {
					System.out.println("\n오답입니다.");
					g++;
				}
			} 
			if(d==1 && sc1!=e) {
				if(so1==sc1) {
				System.out.println("\n정답입니다.");
				f++;
				}else if(so1!=sc1) {
					System.out.println("\n오답입니다.");
					g++;
				}
			} 
			
			if(sc1==e) {
				break;
			}
			
			a=0;
			b=0;
			c=0;
			d=0;
			
		}
		System.out.println("----------");
		System.out.printf("\n정답개수는:%d \n오답개수는:%d ",f,g);
		sc.close();
	
	}

}
