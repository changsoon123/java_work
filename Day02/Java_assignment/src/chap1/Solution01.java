package chap1;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] soso = new int[10];
		
		for(int i=0;i<soso.length;i++) {
			System.out.println("중복 없이 값을 입력해주세요: ");
			int scsc = sc.nextInt();
			soso[i]=scsc;	
			
		}
		
		for(int i=0;i<soso.length-1;i++) {
			if(soso[i]>soso[i+1]) {
				soso[i+1]=soso[i];
			
				
			}
		}
		System.out.println("최대값은: ");
		
		System.out.println(soso[9]);
		
	}

}
