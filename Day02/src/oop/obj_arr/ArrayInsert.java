package oop.obj_arr;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		/*
        - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
         정보를 입력받으시면 되겠습니다.
         입력받은 정보를 토대로 Person객체를 생성한 후
         여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.

        - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
         입력을 반복해서 받아주시면 됩니다.

        - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
         각 객체의 personInfo()를 호출해 보세요. 
        */
		
		Scanner sc = new Scanner(System.in);
		
	
		
		
		Person[] p = new Person[3];
		
		
		for(int i=0;i<p.length;i++) {
			
			System.out.println("이름을 입력해주세요. ");
			String so = sc.next();
			System.out.println("나이를 입력해주세요. ");
			int si = sc.nextInt();
			System.out.println("성별을 입력해주세요. ");
			String su = sc.next();
			
			p[i] = new Person(so,si,su);
			
			
		}
		
		for(int i=0;i<p.length;i++) {
		p[i].personInfo();
		}
		
	}

}
