package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요. ");
		int[] scores = new int[5];
		for(int i=0;i<scores.length;i++) {
			int ssc = sc.nextInt();
			scores[i] = ssc;
			
		}
		System.out.println("점수-------순위");
		System.out.println("-------------");
		int[] count = new int[5];
		
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores.length;j++) {
				if(scores[i]>scores[j]) count[j]++;
				
			} 
				
			}
		
		for(int i=0;i<scores.length;i++) {
			count[i]++;
			System.out.println(scores[i]+"\t"+count[i]);
		}
		
		
	}

}
