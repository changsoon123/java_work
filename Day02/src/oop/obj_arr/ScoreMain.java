package oop.obj_arr;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
        - Score 객체를 담을 수 있는 배열을 선언하세요.
         배열의 크기는 넉넉하게 100개로 하겠습니다.
         
        - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
        입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
        총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
        (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
        객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
        이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.
        
        - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
         scoreInfo()를 모두 불러주세요. (반복문)
         주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
         모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
        */
		
		/*
		 * 
		 * 
Person[] p = new Person[3];
		
		
		for(int i=0;i<p.length;i++) {
			
			System.out.println("이름을 입력해주세요. ");
			String so = sc.next();
			System.out.println("나이를 입력해주세요. ");
			int si = sc.nextInt();
			System.out.println("성별을 입력해주세요. ");
			String su = sc.next();
			
			p[i] = new Person(so,si,su);
			
			
		} */
		
		
		Score ss2= new Score();
		Score[] ss1= new Score[100];
		Scanner sc = new Scanner(System.in);
		
		s1: while(true) {
			
			s2: for(int i=0;i<ss1.length;i++) {
		System.out.println("이름을 입력해주세요.그만을 치면 그만둡니다. ");
		try {
		String aa0 = sc.next();
		if(aa0.equals("그만")) {
			break s2;
		}
		
		System.out.println("국어 점수를 입력해주세요. ");
		
		int aa1 = sc.nextInt();
		
		System.out.println("영어 점수를 입력해주세요. ");
		int aa2 = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요. ");
		int aa3 = sc.nextInt();
		
		
		
		ss1[i] = new Score();
		ss1[i].setName(aa0);
		ss1[i].setA(aa1);
		ss1[i].setB(aa2);
		ss1[i].setC(aa3);
		ss1[i].setResult();
		ss1[i].setAvr();
			
			
		}catch(InputMismatchException e) {
			System.out.println("당신 때문에 망했습니다. ");
			break s1;
		}
			}
			
			for(int i=0;i<ss1.length;i++) {
				try {
			       
					ss1[i].scoreInfo();
			     
				} catch(NullPointerException e) {
					System.out.println("");
					break s1;
				} finally {
					
					
				}
			}
			
	}
		sc.close();
	}
}