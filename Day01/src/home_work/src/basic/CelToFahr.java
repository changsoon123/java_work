package basic;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {

		/*
		 * 사용자에게 섭씨온도를 입력받아서
		 * 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 * 화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		 * ㄹ 한자 7 -> (℃) ㄹ 한자 다음장 4 -> (℉)
		 */
		
		
		
		   
		        Scanner sc = new Scanner(System.in);
		        
		        
		        System.out.print("섭씨온도를 입력하세요: ");
		        double aplus = sc.nextDouble();
		        aplus = (aplus * 1.8) +32;
		        if(aplus>50) {
		        System.out.printf("화씨온도:%.1f℃\n",aplus);
		        }
		        
		        System.out.print("화씨온도를 입력하세요: ");
		        double aplus1 = sc.nextDouble();
		        
		        aplus1 = (aplus1-32)/1.8;
		        if(aplus1>1) {
		        System.out.printf("섭씨온도:%.1f℉",aplus1);
		        }
		        
		      
		        
		       
		        sc.close();
		    
		
		
	}

}
