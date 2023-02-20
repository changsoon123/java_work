package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.next();
		System.out.println(name);
		
		System.out.println("나이:");
		int age = sc.nextInt();
		System.out.println(age);
		
		sc.nextLine();
		
		System.out.println("출생년도: ");
		String age1 = sc.nextLine();
		System.out.println(age1);
		sc.close();
		
		
	}

}
