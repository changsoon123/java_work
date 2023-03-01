package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숙제를 낸 8명의 출석번호를 적어주세요.(1~10)");
		
		int[] sso = {1,2,3,4,5,6,7,8,9,10};
		
		int[] count = new int[8];
		int[] tmp = new int[10];
		
		for(int i=0;i<count.length;i++) {
			int sol = sc.nextInt();
			count[i] = sol;
		}
		
		System.out.print("숙제를 안 낸 학생의 번호: ");
		
		tmp = sso;
		
		for(int i=0;i<sso.length;i++) {
			for(int j=0;j<count.length;j++) {
				if(sso[i]==count[j]) {
					sso[i]=0;
				}
			}
		}
		
		for(int i=0;i<sso.length;i++) {
			if(sso[i]!=0) {
		 System.out.print(sso[i]+" ");
			}
			}
		
		sso= tmp; tmp=null;
	}

}
