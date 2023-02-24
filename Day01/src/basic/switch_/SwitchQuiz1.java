package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.println("연산자를 선택하세요.[+,-,*,/]: ");
		String op = sc.next();
		System.out.println("정수2 입력해주세요.");
		int num2 = sc.nextInt();
		
		int result = 0;
		boolean flag = false;
		
		switch(op) {
		case "+": result=num1+num2; break;
		
		case "-": result=num1-num2; break;
		
		case "*": result=num1*num2; break;
		
		case "/": if(num2==0) {
			System.out.println("숫자 0을 나눌수 없습니다.");
			flag = true;
			break; }
			result=num1/num2;
			break;
			
			default:
				System.out.println("연산자를 잘못 입력했습니다.");
				flag = true;
				break; 
				
		}

		if(!flag) {
		System.out.printf("%d %s %d = %d\n",num1,op,num2,result);
		}
		
//		switch(op) {
//		
//		case "+" : System.out.println(num1+num2);break;
//		case "-" : System.out.println(num1-num2);break;
//		case "*" : System.out.println(num1*num2);break;
//		case "/" : if(num2==0) {
//			System.out.println("연산할 수 없는 입력값입니다.");
//			break;
//		}
//		System.out.println(num1/num2);break;
//		default:
//				System.out.println("연산자를 잘못 입력했습니다.");
//		break;
//		}
		
		sc.close();
		
	}

}
