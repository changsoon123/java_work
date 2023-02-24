package basic.if_;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		/*
		 * 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
		 * 혹은 같은지를 판별하시면 됩니다.
		 * ex)
		 * 입력받은 수: 4, 7 -> 7이 큰 수 입니다.
		 * 입력받은 수: 10 , 3-> 10이 큰 수 입니다.
		 * 입력받은 수: 5,5 -> 같은 수 입니다.
		 *
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력해주세요. ");
		
		int input1 = sc.nextInt();
		
		System.out.println("두번째 수를 입력해주세요. ");
		int input2 = sc.nextInt();
		
		
		if(input1 > input2) {
			System.out.printf("%d이 큰 수 입니다.",input1);
		}else if( input1 < input2) {
			System.out.printf("%d이 큰 수 입니다.",input2);
		}
		else if(input1 == input2) {
			System.out.println("같은 수 입니다.");
		}
		
		sc.close();
		
	}

}
